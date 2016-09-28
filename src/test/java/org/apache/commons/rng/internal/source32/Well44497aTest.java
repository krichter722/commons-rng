/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.rng.internal.source32;

import org.junit.Assert;
import org.junit.Test;

public class Well44497aTest {
    @Test
    public void testReferenceCode() {
        final int[] base = {
            0x2c2878c6, 0x47af36c4, 0xf422e677, 0xf08fd8d3, 0xee9a47c7, 0xba983942, 0xa2a9f9a5, 0x1d443748,
            0x8fc260b2, 0x5275c681, 0x4a2f5a28, 0x2911683d, 0xa204c27e, 0xb20a6a26, 0x54ba33be, 0x67d63eb0,
            0xdc8174cf, 0x3e73a4bc, 0x6fce0775, 0x9e6141fc, 0x5232218a, 0x0fa9e601, 0x0b6fdb4a, 0xf10a0a8c,
            0x97829dba, 0xc60b0778, 0x0566db41, 0x620807aa, 0x599b89c9, 0x1a34942b, 0x6baae3da, 0x4ba0b73d
        };
        final int[] init = new int[1391];
        for (int i = 0; i < init.length; ++i) {
            init[i] = base[i % base.length] + i;
        }

        final Well44497a rng = new Well44497a(init);

        final int[] refInt = {
            0xa8ae884a, 0xa5241b7f, 0x3ad211ce, 0xf526210c, 0xcf2feb2e, 0x97ffba0e, 0x52feddda, 0xf51d0147, 0x8734a1d2, 0x4acbbeb2, 0xe788e18f, 0xad07070d, 0xc6425a56, 0x588f6997, 0xd490294e, 0xf9488e69,
            0x10661884, 0xbe534578, 0x471d345f, 0x1a6f733f, 0xe18cc123, 0x20c659a8, 0x75afd83c, 0xb76d1580, 0xebfb9078, 0x85df2067, 0x3f98521b, 0xdb8b8dcd, 0x75f40193, 0x29048e7e, 0xe461eb58, 0x0365b046,
            0x29ae4ce9, 0x2424d096, 0x06ffaab1, 0x7426e78f, 0xe30e5c49, 0x16ff7a29, 0x66d5655a, 0xc930b87f, 0x0435efd4, 0x7ee00964, 0x668820e3, 0x2c07c519, 0x45431f6c, 0xdb8e2218, 0x57916201, 0x7a49c076,
            0x244da2eb, 0x8a78fb16, 0xc61df7bb, 0x2e44ca30, 0x608c0d17, 0xa3c715d2, 0x598e6afa, 0x366dd741, 0x68fad791, 0x04dfe8d4, 0x03b5e214, 0x5a8b4ef4, 0x49d9bf18, 0x1d2f364c, 0xd04a5ac2, 0x82657d22,
            0x1d85fd6f, 0x100f6eb4, 0x87ff6147, 0x400d51a9, 0x620e9ee4, 0x22d4c70a, 0xe7d5a2b7, 0x4830703c, 0x85352976, 0xffe0c0b0, 0xe5896bd0, 0x102a7741, 0xc443db14, 0x5a8eeba2, 0xd691ab70, 0xfb49015f,
            0xa54d6898, 0x0b783095, 0x451cbca2, 0xaf440bf7, 0xe38d46e9, 0x22c7d7b4, 0xd88ea06e, 0xb56c933b, 0xe9fa124f, 0x87deae52, 0x82b5204e, 0xd98a09e9, 0xc8d97ff7, 0x9c2fff81, 0x514a9e01, 0xce6cc44c,
            0x9c853f1b, 0x910fa157, 0x04fe2053, 0xc10d9321, 0xe10fdc4e, 0xa3d404ab, 0x64d4e81e, 0xcb3130ef, 0xb9189319, 0x7ce1869b, 0x6489a897, 0x912ab85f, 0xf06864ae, 0x66a35cb8, 0xe2ba1984, 0xc764bdaf,
            0x264c2a9c, 0x887972ff, 0xc41c7d2f, 0x2c4543d8, 0x628d8d24, 0x2efe649b, 0x5b8fe05c, 0x346c521f, 0xa5f3ad10, 0x06de66f6, 0x01b46956, 0x588aca73, 0x4bd835a6, 0x1f2eb048, 0xd24bd232, 0x4f6c004f,
            0x1f847910, 0x120ee210, 0x85feeb8d, 0x420cdd07, 0x600f14e8, 0x20d54003, 0xe5d42332, 0x4a31f03b, 0x38185c23, 0xfde144a6, 0x68b01814, 0x122bf3e1, 0x7168a77c, 0xe7a391ba, 0x63bad890, 0x4664710f,
            0xa74ce8e8, 0x0979bd77, 0x0935b5ca, 0xad45830b, 0x56a633e1, 0xaffeaffa, 0xda8f22df, 0x0047e018, 0x24f365e5, 0x2affdd04, 0x80b4a2d2, 0x64a77769, 0xcad8fb2c, 0x9e2e7394, 0x534b1ff6, 0xcc6d4325,
            0x9e84bc3d, 0x930e2b3e, 0xb1d55eaf, 0xc30c1637, 0x5424a696, 0xa1d58d75, 0xd9f9958e, 0x7e1a4ea1, 0xbb191149, 0xc1ccf4cf, 0xe9b0d595, 0x932b3948, 0xf269e6dd, 0x64a2d999, 0xe0bb937b, 0xc565373a,
            0x8b6d51ba, 0x2558063d, 0x88357b5e, 0x9168063d, 0xd7a6f8df, 0x2cffe18e, 0xeea49aa9, 0x814728d7, 0xa7f2202b, 0xabff189a, 0xb49f1dbe, 0xe5a7b4f9, 0xfef34366, 0xa203ca0a, 0x7f6aa08e, 0x4d6d838d,
            0xd28d08c4, 0xbf2f9a83, 0x30d59494, 0xff21a95a, 0xd52463a7, 0x9df83f32, 0x58f95b89, 0xff1a897f, 0x3a19db1f, 0x40cc3f2b, 0x6ab19c9f, 0xa7008e8a, 0x73692f8b, 0xe5a21873, 0x61bb5504, 0x4465f5d4,
            0x0a6d9a94, 0xa458c70d, 0x0b343bde, 0x1068caab, 0x54a7b59d, 0xadff25ca, 0x6fa45ed1, 0x02465711, 0x26f2e2aa, 0x28fe5b21, 0x359fd47f, 0x66a6fdc8, 0x7ff38f2d, 0x2303076d, 0xfe6a6170, 0x794639c7,
            0x538dcc42, 0x3e2f5b79, 0xb3d4d08a, 0x7e21615c, 0x562522bd, 0x08f8f8b5, 0x1bf81147, 0xc81bc3e9, 0x0a3264db, 0xf3cd7889, 0x4bb15859, 0xd20045d0, 0xff449d73, 0xb989aff5, 0x6596edfc, 0xf04e4dbb,
            0xcd6cdc55, 0x93598784, 0xda34f1af, 0x43698540, 0xa5a77c5a, 0xc9d493d8, 0x58a516fd, 0x3b469b17, 0x32d9540c, 0x65fe9e05, 0x5a9e93f1, 0x3fa63cf2, 0x64f2c682, 0xdc0243db, 0x116b2dc6, 0xd046f7e7,
            0xa88c88e0, 0x0d2e198f, 0x9ad411f8, 0x4d202878, 0x6725e697, 0x3ff9b649, 0x1ef8d9fc, 0x291b02c0, 0x4332ab6a, 0xa6cdb170, 0xb79ae42e, 0x31010c05, 0xa2445835, 0xe08965f1, 0xc496269a, 0x854e8069,
            0xbc6c1479, 0x22594262, 0x5e1f4b59, 0xee694b25, 0x598ac7f8, 0xd4d455ec, 0xc9a5d13d, 0x436b2871, 0x13d995b8, 0x49d529ab, 0x3f9e511f, 0xd38d8e54, 0xc5f20ef4, 0x5d028718, 0xd86be75f, 0xdb47b956,
            0x418c4e01, 0x282edd4c, 0x16ddaa61, 0x5420e9a6, 0x6f0859d7, 0x8ef9724d, 0x4ed36572, 0xd522b8e2, 0xa433e8c7, 0x3ae60c16, 0x2e9a2f41, 0x7801c1bb, 0x85451081, 0xf7882289, 0x039762a0, 0x7a4fcdf5,
            0xd847ac37, 0x1672f98a, 0x631f8a99, 0x9a42faaf, 0x908a0409, 0x3bd5127d, 0x35886510, 0x2e6becca, 0xd8d8df83, 0x98d5eb7d, 0x9797e265, 0x7a8d4a20, 0x0dd3b2a4, 0x6d293d54, 0xe440588e, 0xa64774d9,
            0x3da7ff07, 0xf8056595, 0x6fdd632d, 0x700b5d06, 0xfa0896ad, 0xc6d2c81b, 0xe3d3a6ec, 0x0c227260, 0xfd3323c3, 0xa7e6ca86, 0xc59b6f27, 0x30387d6e, 0x4c45d20b, 0x7a88ebe0, 0x5297aee3, 0x974f05e6,
            0x95476d79, 0x83723dcf, 0xa01ec9bd, 0x1b4231eb, 0x4b8b4741, 0xfed5d0a8, 0xd088a0ef, 0xc16aac08, 0x01d81ede, 0xdfd4ad09, 0xbe9721a9, 0xd18c0232, 0xb0d3700e, 0xd429f592, 0xc94099d4, 0x5a6ac0f1,
            0x48a73b45, 0xf105a843, 0x6cdc24ad, 0x150b9be4, 0x3509de74, 0x17d20178, 0xa8d2e5d7, 0xdb2331de, 0x553a995a, 0x7ce78682, 0x589ba1ab, 0xc138b266, 0x046e6f52, 0xeaa95f91, 0x6abc12df, 0xf746babd,
            0x5e462da5, 0xd0737d43, 0xc91e075f, 0x24437131, 0x268b8b3f, 0x6ef86f2e, 0xc389ec69, 0x1c6a674a, 0xa1f5a4bc, 0x16d467bb, 0x4996645b, 0x148cc6eb, 0xe3d234ed, 0x0b28b841, 0x4a41d702, 0x736a0a8f,
            0x03a67e91, 0x8a04e7b7, 0x35dced85, 0x120ad3f1, 0x9c091621, 0xb8d34628, 0x31d22cbb, 0x2a23f2a2, 0x043a5406, 0x51e74eb8, 0xa8b61e4d, 0xf239f982, 0x516ea2b8, 0x17a9983f, 0x9fbcd13d, 0xc6467e9b,
            0x1b46eb3f, 0x0173b989, 0xbd33b382, 0x7d43ba50, 0x62a034d8, 0xb7f8a33a, 0x22892957, 0x4041d682, 0x0cf564a2, 0xa2f9ddef, 0x3096a2b4, 0x48ad7202, 0x1ad2f2c7, 0x2e2874a5, 0x034116de, 0xd86b4a73,
            0x1aa6b2f3, 0x030427c5, 0x19f757ed, 0xb70a1d79, 0xb022a03b, 0x69d38960, 0xaddb91a1, 0xae08441c, 0xb33b1ea6, 0x01c6f5fd, 0xb1b6d17e, 0x93393689, 0x1a6fe4ec, 0x00a8d399, 0xa8bd9931, 0x7547378d,
            0x076b552b, 0x495e0450, 0x98337f3d, 0x217a00e6, 0x37a0f47f, 0xc8f9e96e, 0x0ea29d97, 0x114116f2, 0x0bf42f58, 0xeff91c13, 0xa0bd13c0, 0x49adbe86, 0x12f9442b, 0x2e21c306, 0x0b6ca998, 0x096b8f39,
            0xd28b0cd6, 0xe7299a48, 0xd4f79eac, 0x6333ac21, 0xdd2262ee, 0x59f23650, 0x84db5305, 0x67088ae4, 0xbe3bd233, 0xb4c633a2, 0x86b793cd, 0xe712866a, 0xdf6f213a, 0x49a812a5, 0x61bd5a21, 0x7c47f17f,
            0xd66b9edf, 0x885ec850, 0xf7323f71, 0x0c7ac236, 0x90a1b3b3, 0x49f9269c, 0x5ba25365, 0xc2405803, 0x12f4e899, 0x08f853c2, 0x6dbdde7d, 0xe2acfc1b, 0xb3f98eef, 0x97210592, 0xd66c6958, 0xa1403f70,
            0xd78bce3b, 0xf4bb1107, 0x5bc27d25, 0xacc95c19, 0x102ef254, 0x0ac1f78f, 0x1cd4e509, 0x29f41282, 0x7e7ce7b0, 0xdc3b3eeb, 0x1f1d3ab4, 0x098ff47d, 0xd3a0eaaa, 0x5bdd33eb, 0xb7d1001a, 0xba672ab4,
            0x5c79923a, 0xcf59a9f8, 0xaacf3e8b, 0x50851f39, 0x734856a1, 0xc6ae7cf3, 0xf332d5c2, 0x81252c6d, 0xa2f15f58, 0x590b8436, 0x520e551f, 0x05a91142, 0x0d391a86, 0xf634324d, 0xfcf112cc, 0x1da1e251,
            0x498849be, 0x0fdec559, 0xd1e5b9c5, 0x38dc1111, 0x191521be, 0xad1c5109, 0x6d5698e6, 0x0047c8bf, 0xcad8f3f0, 0xd3a5deb0, 0xbf7671de, 0x55551958, 0x8e085910, 0xf679ce6b, 0xd5fb60a0, 0x749bcf0b,
            0x2648698e, 0xe9aee016, 0x5d243c3a, 0xefbae64c, 0x3fddc441, 0x27c72b48, 0xa3d3bade, 0x1459317a, 0x511a11d7, 0x1683304c, 0xe5f39a54, 0x9c8b92a4, 0x4a116a76, 0xd2e7df8e, 0x26807ad5, 0x721ed8eb,
            0x7f400e7d, 0xf13bd4f6, 0x08903141, 0xfef2653a, 0x6b891f33, 0x18b0e984, 0x3d656029, 0xa0eaf31d, 0x34e6ab8a, 0x20f7d85b, 0x45f73a17, 0xede588bf, 0xef4928a1, 0xbbd085f6, 0x8ed6e84d, 0x022c686a,
            0x46e7705c, 0xa39d5f22, 0x412b1100, 0xe50a6435, 0xd46d7967, 0x423b2afb, 0x64047615, 0xce24a91c, 0xcdc18198, 0x0caeaca1, 0xcd98d5e1, 0x39984c71, 0xcef00848, 0x29bf6acb, 0x24e65645, 0xedd5596b,
            0x93be7934, 0x95540c13, 0xf60d157a, 0x292aae6d, 0xd8172ae6, 0x417badbc, 0xc525c308, 0x1afddd87, 0xbf0a94f6, 0x48c96e37, 0x488fac6d, 0x1e88cc2c, 0xbe063e22, 0x63440e2a, 0xa8d29366, 0xf3a1d2a5,
            0xd0f4ac3e, 0xd4e0ba73, 0x1e855845, 0x562f798a, 0x64e11921, 0xc494eaeb, 0x5621a9ca, 0x3b314eda, 0x9caffaee, 0xca82587f, 0x3c222142, 0x49ac5116, 0x595c1641, 0x659f6dee, 0x93c51a0f, 0x28e9a1f4,
            0xe3a969dc, 0x5eb4932a, 0x34bde2c4, 0xe3df2a3a, 0xe2f29cc9, 0x4eea09a5, 0xb50a5c72, 0xe40d02fe, 0x90bd1ce0, 0xab7ca062, 0x65c8a3e3, 0x3b6f27f1, 0xaf02720f, 0x7300a67c, 0xdbe6ee06, 0xa16126ea,
            0x1bf6a7b7, 0x42d8f997, 0x2c9cf66c, 0x47a4d156, 0x8e5b3b99, 0x048dbf89, 0x0f90354c, 0xd08d9cbb, 0x8ae89e1b, 0x67b4bd96, 0xd2e36042, 0x5e41c86d, 0x587e5ae3, 0x1cdb5613, 0xd5eb8a6e, 0xaf0f9b3e,
            0x20b1c1e7, 0x2c39e9cc, 0x3cac683e, 0x841c8da0, 0x7d0af9ef, 0x21edd1e9, 0xfa85a975, 0x6f1b32ca, 0xcbc7524e, 0x14112e63, 0x8bbef2ce, 0xcc0181c0, 0xd88751fd, 0x106f3807, 0x29ef8e64, 0x4f8704c6,
            0xf3084f62, 0x3e3b8f81, 0x2c50f298, 0xa57cd65a, 0x013a8c24, 0xd2305e5b, 0x3a348c72, 0xfe808c16, 0xc55edb0c, 0x04466663, 0xf8e498d7, 0x15fc1d57, 0xd090ee0c, 0x297d3eec, 0x523d8c36, 0x0e031767,
            0x27b6a18a, 0xb1b2b0fe, 0xd99f50c8, 0x1fdc2b4b, 0xf112fad7, 0xb622257c, 0x097e2f50, 0xbd45bb62, 0x45a0bb53, 0xae8c935e, 0xb0638c4b, 0x0ec995ec, 0x52dc0b63, 0x7a48f924, 0xc2fde5b3, 0xa7cc4f23,
            0x958f11fa, 0x5ff36ee6, 0xc9374765, 0x6584c544, 0xcd2f1110, 0x5dccd99e, 0xe996845b, 0x122efade, 0xb6949925, 0xa46504da, 0xf88ac8bf, 0xca8d7d78, 0x32d26e2f, 0xe4b11e69, 0x2c923e48, 0x45eb2d55,
            0xa277e53c, 0x12a076ed, 0x9bd52416, 0x06fa983f, 0x2f5c720d, 0xb6a05efc, 0xc17a3591, 0x7e5208cf, 0x618e8114, 0xe0dd237c, 0x61007c22, 0x207d38de, 0x9bab6a98, 0x589a232f, 0x95200120, 0x71bf656d,
            0xb6ebed39, 0x5366d788, 0xdcf0df5e, 0xb3258773, 0x1fde1119, 0x7ebbecc3, 0xf1cade95, 0xb5d1527e, 0xa24fbe33, 0x85a6627d, 0x59185873, 0xe07d28df, 0xc589c685, 0xf6fb9b61, 0xa8781bdc, 0x6fd6d3f5,
            0xee051de2, 0x577f4d00, 0xd3ca3cf0, 0xdb833383, 0x05818f4e, 0x3ae26361, 0x3dd9e2ea, 0x2f5005b1, 0xad49d7db, 0x14d4cbdb, 0x21a9eb84, 0xbac8d9ee, 0x24efeb0d, 0x7afa7069, 0x0b60b8aa, 0x04e0dee7,
            0xa7a35cee, 0x10e1d009, 0x06d0ed24, 0x8ffa873d, 0xb3815054, 0xadcf9ab6, 0xd47aebcd, 0x5d9f906e, 0xef3af4f7, 0x7f0fd1dc, 0x2f6cb93e, 0xe25acd48, 0x1a156fb1, 0x72f4610e, 0x556ba647, 0x94a276a9,
            0x85425b3c, 0xf2c988f2, 0x09c0e9c1, 0xe77bc354, 0x0e908925, 0x2ee4e69a, 0x1d282fc4, 0x1bb1a5d2, 0x4b09858c, 0xf2594e12, 0xc4b674f9, 0x7322c071, 0x6a5872bd, 0xfa363075, 0x670db884, 0xb0c707f7,
            0xa043ffb6, 0x4ff10759, 0x641d27c9, 0xd085aefa, 0xc322db13, 0x551ae33c, 0xf32f916b, 0x0ef2c668, 0x3d612668, 0x0567632d, 0x23e9dee2, 0x7b43ccaf, 0x587104a3, 0x002395c1, 0xe4bb9b77, 0x281400fe,
            0x5bf4ca29, 0x6a2bc460, 0x8abf6ef7, 0x85ad7cab, 0xb59a6361, 0x9c11d077, 0x116de09c, 0x0c7effa5, 0x6859663c, 0x740af36a, 0xce5bc8fe, 0x69bfd15f, 0xe52add86, 0xe641b3ad, 0x248eaf44, 0x75632e93,
            0x4a924265, 0xb144891f, 0xfcfb008c, 0x10485f93, 0xee56f65c, 0x47497d05, 0x4f4358da, 0x2d43d0ea, 0x3bce9c36, 0xefa2954d, 0xdf48a8e1, 0x857d1e64, 0xd24d6990, 0xe4573866, 0x9292460f, 0xf5e70f0b,
            0x30ebac60, 0x6a037c37, 0xa1b3779c, 0x98fad5a5, 0x844c11c6, 0xa03d76c8, 0x9a8be78d, 0xff100ff0, 0x02b7f4fb, 0x8aba2ce6, 0xd7f9e8e1, 0x9242e3e7, 0xc98f2448, 0x33d643b4, 0xd06de850, 0xa2c5c661,
            0xc93ab33b, 0xcfb75c3e, 0x198f6c38, 0xabbfe29b, 0xcdade806, 0x501a8128, 0xd6ea5702, 0x6cf12fa6, 0xd055c019, 0x651e0329, 0xd4b7b168, 0xadad356a, 0x624d1eb0, 0x6ac21db1, 0x905e895e, 0xe30d08b9,
            0x5b7d770d, 0x9fec542d, 0xdd52cd61, 0x0e77eddd, 0xe9351ed6, 0x27d74538, 0x1724f508, 0x2ca211c6, 0x2a8bc91d, 0x95adc424, 0x9351198a, 0xc3da6170, 0x7b780411, 0x44cfe602, 0x4e121fea, 0x989e02e0,
            0x483f1bb8, 0x3ae814d2, 0xa921696d, 0x654fd279, 0x946e039d, 0x8d6406d2, 0x3b9bf306, 0xf27f07b3, 0x07d5639d, 0xc020f194, 0x1551c4f9, 0x5dd43c63, 0x3b67b3b6, 0x398f7aed, 0xfd28e448, 0x0e8a1b4a,
            0x3037aced, 0xd91e54cf, 0x207b8a8d, 0xb880ed37, 0x29e3ce73, 0x3b7779f4, 0x5f01668c, 0x7e53092f, 0x5682a00e, 0xfd7f3d2f, 0x79399211, 0xc293e126, 0x6924a8bf, 0x1b4472e3, 0x88b84303, 0xe9bf022d,
            0x8bc04e7c, 0xb3029d94, 0x265266c3, 0x932da2ea, 0xa34617c1, 0x6335d441, 0xfe86c45e, 0x7138ac8c, 0x04ae1c16, 0x6318969d, 0x67fe2e8c, 0x80461d7a, 0xa0c2b07c, 0x07090143, 0x5f2be9d4, 0x1819318b,
            0xaf7b337c, 0x26aa684f, 0x46a8a99f, 0x6b2d68b1, 0x30d8d41d, 0xa89305fe, 0xd33869d9, 0xcb8f0d2e, 0x8ce6823d, 0x575b5469, 0xac69ece8, 0x2dce3ee7, 0xac43a267, 0x8dd0f670, 0x91fa69f9, 0x12aa7dc7,
            0x49e2c52e, 0x768a2d47, 0xdee90b6e, 0x8d38abb8, 0xf520cee9, 0xad01cd68, 0x03ddb46b, 0xe17d6825, 0x700dfb2b, 0x36c560bc, 0xcde2d010, 0x1b65184d, 0xa542beaa, 0x936fb278, 0x3a400751, 0xfc6310ef,
            0x91ed2b38, 0x4809aa29, 0xe1483d3d, 0x4335edfe, 0xe8744921, 0x1d5155a4, 0x7a6a6924, 0x21dfe6d6, 0x5f30b46e, 0x50cd038e, 0x84a6331c, 0x71344b4b, 0x32597fe7, 0xdabd8b7f, 0x44501723, 0xc223965d,
            0x47c27ea1, 0x6fccb2ad, 0x3b40e379, 0x57bb0174, 0x78ce89a2, 0x004b6686, 0xc074ff7f, 0xc55d56c2, 0x7970b5c1, 0xce23b368, 0xda3f40ad, 0x48d50005, 0x7f6091c8, 0xe9f3e608, 0x16340b6c, 0xf9638cc7,
            0x04cc9a50, 0xd8c6d90e, 0x2b62c5b4, 0xaf50ecc6, 0xe3a91016, 0xeea2c371, 0x3f24d19e, 0x23462e3f, 0x3cb0ff1a, 0xeb3e0a0f, 0x6f17bfe2, 0x0eaa285c, 0xc2d67480, 0xaf273c38, 0xb700b2ca, 0x0fa48fe5,
            0x4af81a71, 0x985eff8c, 0x0498eea6, 0xb14e698f, 0xffdc40b9, 0x93afeafa, 0x8fb47bf9, 0x517e2631, 0x90eb5bbe, 0xbc7dccd7, 0x08e1effb, 0xb6ca0248, 0xdd8bf4c1, 0x154613f3, 0x7dbf57ac, 0xcb877aeb,
            0xcc4b7d82, 0x82a1f27c, 0xe432cb3d, 0x1a607024, 0x158c332d, 0xb9e1cfa8, 0xc595b709, 0x72194d6a, 0x711c6119, 0x524d70a3, 0xf48885a2, 0x51d3ed03, 0x89a1665e, 0x40b224f0, 0x5d44daac, 0x68d9de4a,
            0x670de923, 0x24e06832, 0xecc5bde3, 0x36379112, 0xc51eef5c, 0x06dfac0c, 0xd447393e, 0xe56a3644, 0x487bc4b0, 0x044af5da, 0xc54d5ce4, 0x704bebd8, 0x17225487, 0xe8f3f3c3, 0x82c1768b, 0x3cc297c9,
            0xd1c0a480, 0x3a145cca, 0x9103e219, 0x5685932e, 0x58b274f1, 0x9b2705ca, 0x0941fbcd, 0x6997da01, 0x2cab7638, 0xef0caf78, 0x4e417b2e, 0xc7045996, 0x498ff349, 0xedf1e56e, 0xe4d63c48, 0xed0eb104,
            0xd9ff9b0a, 0xc15bc1ef, 0xf940e692, 0xbe486622, 0xeddfd360, 0xfb0ed29c, 0x30b8a2e6, 0xf0ccb7de, 0xfea83275, 0xef52620e, 0xd288421f, 0x582b4030, 0xc3dcfbe9, 0x98649927, 0x2f203cf2, 0xb7681f4e,
            0xbd6114e8, 0x20853550, 0x77bf82d5, 0x0f4e45a6, 0xe2b16fc8, 0x531148bb, 0x386840d5, 0x92875447, 0x84f08144, 0x32ebb7f1, 0xc5a57165, 0x1607d665, 0xeb23ef5d, 0x84472ea7, 0xa371e168, 0x8e150474,
            0x72330ebd, 0x0401ed33, 0xf05b1f1d, 0xd67a9c88, 0x01e3960b, 0xb641c4da, 0x963a0f4a, 0x96bf7161, 0x36d23641, 0x9e4f5f08, 0xe54f040d, 0x10ea0e79, 0x8c33b68b, 0xdc025a36, 0xb20579a4, 0xac761e10,
            0x80161ada, 0xc91e4ec8, 0x4bf1e6e3, 0xd0499356, 0xc1be9f13, 0x39c95fb6, 0x0d8d4944, 0xdc950250, 0xded34089, 0x735428c3, 0xc599a441, 0x79724d47, 0xc76f240a, 0x6de0ea66, 0x78d66aea, 0x271f22c2,
            0xa23e96bf, 0x373b8263, 0xb3921694, 0x3317c684, 0xd43080ab, 0x1f8ab5d9, 0xd202d203, 0xb2014636, 0x1f029c45, 0x60718e3c, 0x48a01894, 0x256a5a37, 0xfdba5c3b, 0x7fa84f1e, 0x67c6e088, 0xaa5729be,
            0x50b784fe, 0x3eabc2e2, 0x6d93ff6c, 0xe0f23b24, 0x00b4cc14, 0x4d184b90, 0xb2650e21, 0xab3b8b07, 0x8b8063b6, 0x7a5e04ff, 0xacb7f5ea, 0x425cd211, 0xbddd944d, 0x852731f0, 0x3ec085a4, 0x30043902,
            0x15a6b247, 0x940a7051, 0xa5d2decf, 0xba82b019, 0x29ce9075, 0xc676e501, 0x2226f896, 0x91e21758, 0x7dc0913c, 0x83e255c5, 0x07a9a95e, 0x25f4ed18, 0x129adb8c, 0x059b7d88, 0x1d77ad9b, 0xa3adbde4,
            0x7c547198, 0xc0a2d5cb, 0x30bec354, 0x9724800a, 0x88e62084, 0x21a7a7f5, 0x52508084, 0x42470680, 0xb9018291, 0x52f59407, 0x80cc2f08, 0x1620835a, 0x8ce9ec7c, 0xbccea26e, 0x015c4ce5, 0xbdfe5e13,
            0x933be568, 0x78861e4b, 0x30982fe1, 0xb65224b5, 0x021130af, 0xbdbb45de, 0x9efc7d0a, 0xb1ca8bd8, 0xd8be76b7, 0xf9727e27, 0xd3579a0c, 0x0530fe42, 0x55d3bfca, 0x896edc93, 0x4a975959, 0xcb993653,
            0x0194d907, 0x8c46df02, 0xa09c5d09, 0x4765bede, 0xeaa12521, 0x2e7d3d35, 0xfbf4273f, 0x46dd082e, 0xfb2a03ea, 0x51c129e0, 0xcdc5df27, 0x5d81e110, 0xf81c674d, 0x62f5a2a5, 0x74a49b11, 0x4755013d,
            0x125ac0a7, 0x01a840dc, 0xa4b860e8, 0x17abafb9, 0xd5ad5784, 0xca87a224, 0x38187b39, 0x6d75337b, 0xe3dde7ab, 0x4877ba59, 0x30b52c46, 0xba6db09f, 0xb4f03274, 0xe4caf103, 0xbfc8ae95, 0x452fe298,
            0xf8fdb65e, 0x65a06cac, 0x8eb558c2, 0xa75684e1, 0xbfe5980b, 0x28201adb, 0xf10bb48a, 0x677839fd, 0x90b6e316, 0xecc28ce5, 0xfe43ac8a, 0x1db4062f, 0x38e6eeab, 0x8d61b89c, 0xcb85bd41, 0x6a23832c,
            0x69181af8, 0x9c4365a8, 0x9a5c5dc3, 0x6cf0274e, 0x77246a1c, 0x2ddcfb4a, 0x9f10eb22, 0x3838bea1, 0x8b47f98f, 0x82f332e1, 0xee9e2db4, 0x2161a678, 0x52b39e4c, 0x7ac6fd53, 0xc93488dd, 0xc4f962d5,
            0xa7b6e029, 0x5e0316b9, 0x44f0858e, 0x6a1dd16f, 0x7e61395f, 0x290ac8bd, 0xf2c16a25, 0x15473849, 0x1e3c2d92, 0xfeb0187c, 0xc62eafea, 0x3fd92f7e, 0xb1cbabac, 0x1c2544e7, 0xed0c7427, 0xc524202f,
            0xbe7915b8, 0xf7f73a0b, 0x2713050f, 0x5263d1a5, 0x3d0a1eec, 0x2f928776, 0xf60dde52, 0xa72464d4, 0xa176ce19, 0x10025ffb, 0x51fe0c1e, 0x9c8af51a, 0xed7c121c, 0xef188d94, 0xcf2797c0, 0x0aa1809b,
            0xda0e093e, 0xf2a4dc8c, 0x8b82e782, 0xb69aed05, 0x432b143d, 0x5e70775f, 0x2689ca25, 0x743ac1ec, 0x9fb28344, 0xb9a82828, 0x3d2290a7, 0x7004a58e, 0x6eff1e06, 0x9dd60e19, 0xdf5c1979, 0xea48db1c,
            0x236100f5, 0x3f88a96e, 0x8ad662fd, 0x37a9229e, 0x739e1097, 0x5ceb7555, 0xb1689b3b, 0x2f2f5ff6, 0x0a03209e, 0x68447867, 0xf36bb7df, 0x145d1f75, 0x5a4b620a, 0x832eeda7, 0x6b46cb82, 0xd739a473,
            0x23e326af, 0x8c38afe6, 0x7aeda29e, 0x8a5a2e67, 0x08e55d38, 0x8263f8eb, 0xaadc66a5, 0x23005bf5, 0xc5f94054, 0x4b39c9b7, 0xf93e9015, 0x3e5b22c0, 0x5c36fde0, 0xc9c4ecf7, 0xbaef5e1c, 0x75d10b67,
            0x940af4c2, 0x3e6ad7ae, 0x3e5a96df, 0x41a9ac5f, 0x6d985748, 0x6d5b73a3, 0x69e91de3, 0x5e6b94c3, 0xd20d2466, 0xc433135d, 0xe220df92, 0xdf8c28e4, 0x33ade44e, 0xfbdaedb6, 0x6aa92017, 0x2c6ccba6,
            0x15293bab, 0xd046c380, 0x4ce6261f, 0x97acda3b, 0x24c559bb, 0x6ec4eff1, 0xe3e70b84, 0xf74dc43c, 0x80e6a406, 0xd403da98, 0x5fc5bcd6, 0x554dc3f5, 0x50abf290, 0x094046c2, 0xa3224839, 0x3972e544,
            0xc72ed9a2, 0x3618cd8a, 0x7230c35e, 0x2a5d2646, 0xfcfa7998, 0xc363d099, 0xed967e6e, 0x9ef413d9, 0x5a4b3963, 0x75f721d4, 0xb980c699, 0x87f96fdf, 0x28c28acc, 0x2d010871, 0xc9f3d703, 0x3ff88a93,
            0x265cc19c, 0xe7165060, 0xc697166b, 0xaf0c8b2b, 0xe55d263f, 0x32992462, 0x022c84a3, 0xd0577ceb, 0x2b389b0c, 0xe487f030, 0x50d3971a, 0x4f6c04b2, 0xa5c90efe, 0x38264797, 0x0220c47e, 0x8b2a0174,
            0x035e080c, 0x64297359, 0x758386ed, 0xefbeefbc, 0x6ea2709f, 0xaa51953e, 0xb26548dd, 0xf6f09f33, 0x62626d3d, 0xee1f8d07, 0x0104464f, 0x0f5dfa3e, 0x0f70ffc9, 0xf538529a, 0x217475d0, 0xeb1a3596,
            0xe4efe3ef, 0x7f92f15c, 0x521882e1, 0x49face82, 0x3094bd30, 0x96f4514b, 0x5af07be8, 0xf86dd3c5, 0x9d9834d5, 0x64179b42, 0x1af06375, 0x3002a633, 0xe3afc154, 0x58379d4b, 0x266f1b6f, 0x916cb00b,
            0xe634b195, 0x81ba7683, 0x9ed46d11, 0xc9592e65, 0xdff76d1e, 0x943af59a, 0xa26f07e3, 0x75fd10a7, 0xa353765b, 0x3182e74b, 0x6cff0335, 0x3e7860f1, 0x2675f731, 0x56db561d, 0xd16802d5, 0xfbf4fde3,
            0x8182d51f, 0x0b8e002c, 0xf27f2628, 0x5662636e, 0x2e987bc8, 0xc2b45a65, 0x3a4ce87b, 0x044ee889, 0xb170f9f1, 0xe6b8aeec, 0xefbf3f47, 0xd1f51035, 0xab5bf009, 0xacdd3333, 0xf293bfdf, 0x5771c6c5,
            0x9c7bf757, 0x9edef19e, 0x9d8c3a54, 0x83469c0d, 0xa1b06bd5, 0x885ea3ee, 0x12f83cab, 0xc958781c, 0x53a5c68c, 0x95499661, 0x320500fa, 0xdbaced82, 0x3bbfeecd, 0xe1917797, 0x6e3abec3, 0x82b1bf84,
            0xadb6d27c, 0x78ac4c90, 0x66e14b28, 0x233326e0, 0xa30da16a, 0x4abd2f3c, 0xf8260a05, 0x7baae9ec, 0xf6800e6c, 0xe746f3a3, 0x40137893, 0x35136e6e, 0x61552456, 0x95a1a72f, 0x82f5fb4b, 0x903b52c0,
            0x1f924b15, 0x88c18881, 0x562364d2, 0xe3a4a07b, 0x2edf98e9, 0x70ea54bd, 0x25ce5fe2, 0xa5f665cf, 0x41918902, 0x610fb925, 0x403642b1, 0x79b70112, 0x6470165c, 0x7ba7b8bc, 0x79b3fbf4, 0xd5c34822,
            0x59e07c3f, 0x45e5397f, 0xf682000b, 0xfca29583, 0x98f021a4, 0x79f1ad95, 0xe7dbb076, 0xb40707cf, 0x78e602ae, 0x17574b2f, 0x10018d88, 0xd3ea809e, 0xae88f4fb, 0x5c22f645, 0xeed5917e, 0xc8ca5f1e,
            0x0c598032, 0xd20a533b, 0xc989aae6, 0x8a004c70, 0x3b900cd7, 0xaa6c9bb8, 0x68f22e55, 0xd38c0621, 0xcdf66aee, 0x8f12c269, 0xc01005a9, 0xdaf0e9d3, 0x27973358, 0xe10f522e, 0xd07f4615, 0xe1655d86,
            0x1e241b04, 0x0dde2614, 0xb4e218d2, 0x68922dbc, 0xb2605162, 0x63c2c60f, 0xe3909f1e, 0x020fb0c9, 0x505de07d, 0xf06ef431, 0x9e71c430, 0x856e882d, 0x6446c898, 0x339f1762, 0xbe64d708, 0x45e1d24d,
            0x8cd881ed, 0xd783de5c, 0xdbda853f, 0x13658127, 0x6851e80a, 0xc1f8eb30, 0x4841916d, 0x9b4c6301, 0x8e8e0982, 0xb4ec1723, 0x223e236c, 0x27dcccfe, 0xc6bfe849, 0x85750e90, 0x37814a21, 0x39b583dd,
            0x6a262a49, 0x9ac89453, 0xba1c7ea7, 0x37192497, 0x1d109f87, 0x0114aa48, 0x9ff6d8bc, 0x674de54e, 0x78c8e9db, 0x7f80219a, 0xe82a7675, 0x486a1fcc, 0x6beaaa5a, 0x7e7d4424, 0xee59e390, 0xe90c90c8,
            0x02c25538, 0xdf58bbd5, 0x23d02560, 0xecb80473, 0xcaa853c4, 0xab85b0b7, 0x3be6a274, 0xc9e3c889, 0x95abee53, 0xb3dca1da, 0x092275d3, 0x1b86ad2e, 0xa73d6f72, 0xe02f5e94, 0x49a7d365, 0xaa017fc5,
            0x84f6b836, 0xf2745d34, 0xd6bec3e7, 0x656441bb, 0xc5a1c8a7, 0x4e418115, 0xf7ac4a82, 0x630ffdf4, 0x2c1c632c, 0x52912ba6, 0x5701c33e, 0x4226c5b7, 0x485cce2a, 0xc3b6cacf, 0x726597b0, 0x90f2b4b4,
            0x63a3220f, 0x2c2d94aa, 0x67376f4b, 0x5f317092, 0x12ac9029, 0xaa84344c, 0xc69954a6, 0x759c1800, 0x61c0a734, 0x08c6ebdb, 0x32a5257c, 0xb37e8829, 0xaee7ecc0, 0x433363cb, 0x4574b191, 0x4d4b5344,
            0x0b1bdc1a, 0xc633b647, 0x4f539674, 0x51de3002, 0x4af3263d, 0xe78ba0e3, 0xadfc2466, 0x434af73a, 0xdce29725, 0x8a043f09, 0x844c06af, 0xd71f7b5d, 0x38de0dc3, 0xa1127eeb, 0xeb0686a9, 0x16b93639,
            0xbfc0b67f, 0x40ba8ec2, 0xb937883b, 0xd88d5d8e, 0x3215ce13, 0x3f274efe, 0x5b78c8a6, 0x5e7b07bc, 0x811e4ce2, 0x195c182e, 0xbf8f40fe, 0x4b46284b, 0xbcb8a3d4, 0xdaf42b76, 0xafa34368, 0xee54d024,
            0x8b8449b9, 0xba7c436a, 0x8d5d8d73, 0x8c6debea, 0x4da0669a, 0x0d349421, 0x8f86be6e, 0xa1745821, 0xe79da9a9, 0xc5fee423, 0xfbcff299, 0xdefc6ae5, 0xc4f3ce5f, 0xffb9c159, 0xca90d0b3, 0xbc9c2452,
            0x04c3f96d, 0xf7510ca9, 0x4caae118, 0xbc6d9d54, 0x7eda5298, 0xa0902598, 0xd3ba04ea, 0x027bc3fd, 0x46a53cc1, 0x0b8a7f22, 0x44d4bf77, 0x3e7778c1, 0x0f6468ff, 0xfe779657, 0x9682d1cc, 0x0e49f346,
            0xb16f73f5, 0x472a4344, 0x906d5e2a, 0xd744ee06, 0xbe7462ed, 0x3e592100, 0x9b1a05cd, 0xc33a5c15, 0xb20e1e6f, 0x97322ed4, 0xd3a543f2, 0xd6bf6615, 0x31d1834b, 0x04c244a2, 0xd7bed090, 0x4f4bba3a,
            0x3123d3c4, 0x37c7e26b, 0x534e26d5, 0xc4c6f75b, 0xe1d2cda1, 0x31de8347, 0xfc483589, 0xd6d30b8c, 0x98f17c3d, 0x3fcf10dd, 0xc3416a6d, 0xbeddbe73, 0x93e01443, 0xeab55d59, 0xc3b84125, 0x4add0993,
            0x90c488cf, 0x703feb47, 0x036d2ae1, 0x764a9f53, 0xc4d5dfb2, 0x0d736feb, 0x154f8046, 0xfd682036, 0xb8f660d4, 0x09fb8e86, 0xd7d394dc, 0xe132664d, 0x0fd2e79a, 0x8127ea10, 0x83e79663, 0x242b3d64,
            0x072663cf, 0x8cf6b7a7, 0x1484e94a, 0xb314e7a0, 0x778ae206, 0x14fb6cca, 0x7de1b498, 0xf6edcdf1, 0xc873afe4, 0x94515b6a, 0x3bd937bd, 0xd8f07e15, 0x575581bd, 0xb6c4a59a, 0x364a5b4f, 0x3451953f,
            0x86529bdc, 0x07103d2e, 0x64e3655a, 0x8ed1c32b, 0xd6071f3c, 0xac545e8f, 0x73f309db, 0x7349ba19, 0x91fc9a20, 0x499bc952, 0xa722eb99, 0x069f24e3, 0xbdff8536, 0xf93acb47, 0x08c7ed85, 0xa4d72be2,
            0xa7ca5a20, 0x010fd774, 0x1778aace, 0xed3d20e6, 0x5411457a, 0x27a7d958, 0x83497c72, 0x6c55d72a, 0x97dd5136, 0x8b7df133, 0xa16f1032, 0x860be9af, 0xbbcb0116, 0xc1959f79, 0x26842197, 0xb7533b56,
            0x6d796542, 0xc557cfaa, 0xb49c7bf2, 0x6b536f7a, 0xc3c897c1, 0x0d2253c8, 0x8878f90b, 0xbc2583d2, 0xb6ee8761, 0x62af092a, 0xe871d8a1, 0x98f42f8b, 0x5d59302e, 0x8b07359b, 0x365f879f, 0xa2eaf2b2,
            0xdecdccce, 0xd3b389a6, 0x7b80ad34, 0xa3163bab, 0x6e2a64ee, 0xe464df1c, 0x9e6a52c7, 0xcd242ec0, 0x455e7ceb, 0xc7670eb7, 0x0a34313c, 0x1f319b49, 0x75ccccc3, 0x773d283f, 0x1930ffdf, 0xea5e2e9a,
            0x96533652, 0x9cfa6233, 0x33a9d201, 0xd0d65060, 0x593377bd, 0x8e7b2345, 0x8c5a773f, 0xaa6622b9, 0x86f6f3c7, 0xedb97d46, 0xe5c304cf, 0x6fa094fb, 0x2a188053, 0x9697f74b, 0xd65b295d, 0xa19b5c8d,
            0xf79ca4ed, 0xf99b83f9, 0xd45337cb, 0xa2b4ca7f, 0x6941cf49, 0x9af67e9e, 0xdad6ad9c, 0x72210114, 0xd4e6c5a1, 0x00e9948a, 0x129c27c7, 0x2f9ac636, 0x49ee4fe7, 0x45371418, 0x226d96e6, 0xc297f0b3,
            0xf585c95a, 0x7e0ab8c0, 0x614f5bbc, 0xbe800c20, 0x533c75c6, 0x17da788b, 0x1f75ec7c, 0xc696a43f, 0x0bf4d180, 0x71d28381, 0x46b788c6, 0x6accc6b6, 0x6fc91d04, 0xa7215efc, 0xb09d35ae, 0x68364c9a,
            0x17151edb, 0xce019542, 0x4ab47b88, 0x5adc0202, 0x536dfe02, 0x509c46ff, 0x78cee68d, 0x7e6acd4c, 0x3f05b68d, 0x6f243905, 0x39c52e86, 0x90977869, 0x0c97f592, 0xbb7de9ef, 0xa941be47, 0xdc29d4fb,
            0x131b6e32, 0x0bf5643d, 0xaebe0e3e, 0x23b59595, 0x89140b51, 0x44cfe231, 0x313534e6, 0x7958fbc5, 0x9f9b5b2e, 0x35c49d6a, 0x6b57f136, 0x26c7e5f8, 0xf3793ba9, 0xf57d7b6b, 0x29c79609, 0xc242439a,
            0xa02e1402, 0x1e3c9eed, 0xbe68af0e, 0x11ef978b, 0xab8158a3, 0x460816c9, 0x76d1a9ed, 0x9e1b8523, 0x893fb020, 0x45f4c4bd, 0xb504928a, 0x481778d8, 0x4d7bd14a, 0x941a9890, 0xd69e0a83, 0xfd9e2eff,
            0x884c2aa7, 0x947d9e27, 0xd22f6fb3, 0x63afd584, 0x15996632, 0xab00fc01, 0xb17e8185, 0x28d97512, 0x84a086ab, 0xb03e1d01, 0x8709bd74, 0x67653bba, 0xb8601eaa, 0x97526eda, 0xb24aba3d, 0x51186258,
            0x879e23a4, 0xf35faecc, 0x89f2b9d2, 0x4754bd39, 0xcc8c3c1b, 0x499c1aa8, 0x7fd251f3, 0xc35283c6, 0x070dbdc9, 0xb66951ed, 0x9f1b8520, 0xa59d3eff, 0x521e88ad, 0x27c8a481, 0x807ecd32, 0x8cb53092,
            0x1a980eb0, 0xa232db99, 0x8253b203, 0xf67fc4f4, 0x09a382b1, 0x30214edc, 0x3cbf250a, 0xf2941413, 0x1fea456d, 0xc34fae34, 0x3380c640, 0x5523c74d, 0x68c9b8fe, 0x3e6fb040, 0x94bf7d88, 0x3f6e1ed6,
            0xd13cf25e, 0xb392839b, 0xbadd0f7b, 0xd5b487c2, 0x6506ea26, 0x6b9aa968, 0xd1af0abf, 0xbee956a0, 0x637e8050, 0x6a0f2072, 0x0413ac33, 0xd9ea3783, 0xdae783a8, 0xa2e79fb6, 0xbff59440, 0x3dadb638,
            0x447ec592, 0x1551841a, 0x5ba5d9e8, 0x65b65fa7, 0x5c611529, 0x5ae2d0c4, 0x0d53c132, 0xc024f673, 0xa57c3133, 0xa5055dca, 0x3369c277, 0x2221eeaf, 0x2e603b5f, 0xf4f4a86c, 0xb0fc71fa, 0xc717aba5,
            0xd91bff24, 0xf5b9dc36, 0xc449ff70, 0x0cdce183, 0xbd8d6822, 0x4551bf85, 0xa1e4e6e9, 0x0839c147, 0x8a5fc6d8, 0x1bcf92fd, 0xc754c33f, 0x2d58145b, 0x3d4680b8, 0x91763b8d, 0x3e2b4a33, 0xc61155dc
        };

        for (int i : refInt) {
            Assert.assertEquals(i, rng.nextInt());
        }
    }
}
