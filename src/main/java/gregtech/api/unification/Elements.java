package gregtech.api.unification;

import com.google.common.base.CaseFormat;
import crafttweaker.annotations.ZenRegister;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenMethod;

import java.util.*;

@ZenClass("mods.gregtech.material.Elements")
@ZenRegister
public class Elements {

    private static final Map<String, Element> elements = new HashMap<>();

    private Elements() {}

    public static final Element H = add(1, 0, -1, null, "Hydrogen", "H", false);
    public static final Element D = add(1, 1, -1, "H", "Deuterium", "D", true);
    public static final Element T = add(1, 2, -1, "D", "Tritium", "T", true);
    public static final Element He = add(2, 2, -1, null, "Helium", "He", false);
    public static final Element He3 = add(2, 1, -1, "H&D", "Helium-3", "He-3", true);
    public static final Element Li = add(3, 4, -1, null, "Lithium", "Li", false);
    public static final Element Be = add(4, 5, -1, null, "Beryllium", "Be", false);
    public static final Element B = add(5, 5, -1, null, "Boron", "B", false);
    public static final Element C = add(6, 6, -1, null, "Carbon", "C", false);
    public static final Element N = add(7, 7, -1, null, "Nitrogen", "N", false);
    public static final Element O = add(8, 8, -1, null, "Oxygen", "O", false);
    public static final Element F = add(9, 9, -1, null, "Fluorine", "F", false);
    public static final Element Ne = add(10, 10, -1, null, "Neon", "Ne", false);
    public static final Element Na = add(11, 11, -1, null, "Sodium", "Na", false);
    public static final Element Mg = add(12, 12, -1, null, "Magnesium", "Mg", false);
    public static final Element Al = add(13, 13, -1, null, "Aluminium", "Al", false);
    public static final Element Si = add(14, 14, -1, null, "Silicon", "Si", false);
    public static final Element P = add(15, 15, -1, null, "Phosphorus", "P", false);
    public static final Element S = add(16, 16, -1, null, "Sulfur", "S", false);
    public static final Element Cl = add(17, 18, -1, null, "Chlorine", "Cl", false);
    public static final Element Ar = add(18, 22, -1, null, "Argon", "Ar", false);
    public static final Element K = add(19, 20, -1, null, "Potassium", "K", false);
    public static final Element Ca = add(20, 20, -1, null, "Calcium", "Ca", false);
    public static final Element Sc = add(21, 24, -1, null, "Scandium", "Sc", false);
    public static final Element Ti = add(22, 26, -1, null, "Titanium", "Ti", false);
    public static final Element V = add(23, 28, -1, null, "Vanadium", "V", false);
    public static final Element Cr = add(24, 28, -1, null, "Chrome", "Cr", false);
    public static final Element Mn = add(25, 30, -1, null, "Manganese", "Mn", false);
    public static final Element Fe = add(26, 30, -1, null, "Iron", "Fe", false);
    public static final Element Co = add(27, 32, -1, null, "Cobalt", "Co", false);
    public static final Element Ni = add(28, 30, -1, null, "Nickel", "Ni", false);
    public static final Element Cu = add(29, 34, -1, null, "Copper", "Cu", false);
    public static final Element Zn = add(30, 35, -1, null, "Zinc", "Zn", false);
    public static final Element Ga = add(31, 39, -1, null, "Gallium", "Ga", false);
    public static final Element Ge = add(32, 40, -1, null, "Germanium", "Ge", false);
    public static final Element As = add(33, 42, -1, null, "Arsenic", "As", false);
    public static final Element Se = add(34, 45, -1, null, "Selenium", "Se", false);
    public static final Element Br = add(35, 45, -1, null, "Bromine", "Br", false);
    public static final Element Kr = add(36, 48, -1, null, "Krypton", "Kr", false);
    public static final Element Rb = add(37, 48, -1, null, "Rubidium", "Rb", false);
    public static final Element Sr = add(38, 49, -1, null, "Strontium", "Sr", false);
    public static final Element Y = add(39, 50, -1, null, "Yttrium", "Y", false);
    public static final Element Zr = add(40, 51, -1, null, "Zirconium", "Zr", false);
    public static final Element Nb = add(41, 53, -1, null, "Niobium", "Nb", false);
    public static final Element Mo = add(42, 53, -1, null, "Molybdenum", "Mo", false);
    public static final Element Tc = add(43, 55, -1, null, "Technetium", "Tc", false);
    public static final Element Ru = add(44, 57, -1, null, "Ruthenium", "Ru", false);
    public static final Element Rh = add(45, 58, -1, null, "Rhodium", "Rh", false);
    public static final Element Pd = add(46, 60, -1, null, "Palladium", "Pd", false);
    public static final Element Ag = add(47, 60, -1, null, "Silver", "Ag", false);
    public static final Element Cd = add(48, 64, -1, null, "Cadmium", "Cd", false);
    public static final Element In = add(49, 65, -1, null, "Indium", "In", false);
    public static final Element Sn = add(50, 68, -1, null, "Tin", "Sn", false);
    public static final Element Sb = add(51, 70, -1, null, "Antimony", "Sb", false);
    public static final Element Te = add(52, 75, -1, null, "Tellurium", "Te", false);
    public static final Element I = add(53, 74, -1, null, "Iodine", "I", false);
    public static final Element Xe = add(54, 77, -1, null, "Xenon", "Xe", false);
    public static final Element Cs = add(55, 77, -1, null, "Caesium", "Cs", false);
    public static final Element Ba = add(56, 81, -1, null, "Barium", "Ba", false);
    public static final Element La = add(57, 81, -1, null, "Lanthanum", "La", false);
    public static final Element Ce = add(58, 82, -1, null, "Cerium", "Ce", false);
    public static final Element Pr = add(59, 81, -1, null, "Praseodymium", "Pr", false);
    public static final Element Nd = add(60, 84, -1, null, "Neodymium", "Nd", false);
    public static final Element Pm = add(61, 83, -1, null, "Promethium", "Pm", false);
    public static final Element Sm = add(62, 88, -1, null, "Samarium", "Sm", false);
    public static final Element Eu = add(63, 88, -1, null, "Europium", "Eu", false);
    public static final Element Gd = add(64, 93, -1, null, "Gadolinium", "Gd", false);
    public static final Element Tb = add(65, 93, -1, null, "Terbium", "Tb", false);
    public static final Element Dy = add(66, 96, -1, null, "Dysprosium", "Dy", false);
    public static final Element Ho = add(67, 97, -1, null, "Holmium", "Ho", false);
    public static final Element Er = add(68, 99, -1, null, "Erbium", "Er", false);
    public static final Element Tm = add(69, 99, -1, null, "Thulium", "Tm", false);
    public static final Element Yb = add(70, 103, -1, null, "Ytterbium", "Yb", false);
    public static final Element Lu = add(71, 103, -1, null, "Lutetium", "Lu", false);
    public static final Element Hf = add(72, 106, -1, null, "Hafnium", "Hf", false);
    public static final Element Ta = add(73, 107, -1, null, "Tantalum", "Ta", false);
    public static final Element W = add(74, 109, -1, null, "Tungsten", "W", false);
    public static final Element Re = add(75, 111, -1, null, "Rhenium", "Re", false);
    public static final Element Os = add(76, 114, -1, null, "Osmium", "Os", false);
    public static final Element Ir = add(77, 115, -1, null, "Iridium", "Ir", false);
    public static final Element Pt = add(78, 117, -1, null, "Platinum", "Pt", false);
    public static final Element Au = add(79, 117, -1, null, "Gold", "Au", false);
    public static final Element Hg = add(80, 120, -1, null, "Mercury", "Hg", false);
    public static final Element Tl = add(81, 123, -1, null, "Thallium", "Tl", false);
    public static final Element Pb = add(82, 125, -1, null, "Lead", "Pb", false);
    public static final Element Bi = add(83, 125, -1, null, "Bismuth", "Bi", false);
    public static final Element Po = add(84, 124, -1, null, "Polonium", "Po", false);
    public static final Element At = add(85, 124, -1, null, "Astatine", "At", false);
    public static final Element Rn = add(86, 134, -1, null, "Radon", "Rn", false);
    public static final Element Fr = add(87, 134, -1, null, "Francium", "Fr", false);
    public static final Element Ra = add(88, 136, -1, null, "Radium", "Ra", false);
    public static final Element Ac = add(89, 136, -1, null, "Actinium", "Ac", false);
    public static final Element Th = add(90, 140, -1, null, "Thorium", "Th", false);
    public static final Element Pa = add(91, 138, -1, null, "Protactinium", "Pa", false);
    public static final Element U = add(92, 146, -1, null, "Uranium", "U", false);
    public static final Element U238 = add(92, 146, -1, null, "Uranium-238", "U-238", false);
    public static final Element U235 = add(92, 143, -1, null, "Uranium-235", "U-235", true);
    public static final Element Np = add(93, 144, -1, null, "Neptunium", "Np", false);
    public static final Element Pu = add(94, 152, -1, null, "Plutonium", "Pu", false);
    public static final Element Pu239 = add(94, 145, -1, null, "Plutonium-239", "Pu-239", false);
    public static final Element Pu241 = add(94, 149, -1, null, "Plutonium-241", "Pu-241", true);
    public static final Element Am = add(95, 150, -1, null, "Americium", "Am", false);
    public static final Element Cm = add(96, 153, -1, null, "Curium", "Cm", false);
    public static final Element Bk = add(97, 152, -1, null, "Berkelium", "Bk", false);
    public static final Element Cf = add(98, 153, -1, null, "Californium", "Cf", false);
    public static final Element Es = add(99, 153, -1, null, "Einsteinium", "Es", false);
    public static final Element Fm = add(100, 157, -1, null, "Fermium", "Fm", false);
    public static final Element Md = add(101, 157, -1, null, "Mendelevium", "Md", false);
    public static final Element No = add(102, 157, -1, null, "Nobelium", "No", false);
    public static final Element Lr = add(103, 159, -1, null, "Lawrencium", "Lr", false);
    public static final Element Rf = add(104, 161, -1, null, "Rutherfordium", "Rf", false);
    public static final Element Db = add(105, 163, -1, null, "Dubnium", "Db", false);
    public static final Element Sg = add(106, 165, -1, null, "Seaborgium", "Sg", false);
    public static final Element Bh = add(107, 163, -1, null, "Bohrium", "Bh", false);
    public static final Element Hs = add(108, 169, -1, null, "Hassium", "Hs", false);
    public static final Element Mt = add(109, 167, -1, null, "Meitnerium", "Mt", false);
    public static final Element Ds = add(110, 171, -1, null, "Darmstadtium", "Ds", false);
    public static final Element Rg = add(111, 169, -1, null, "Roentgenium", "Rg", false);
    public static final Element Cn = add(112, 173, -1, null, "Copernicium", "Cn", false);
    public static final Element Nh = add(113, 171, -1, null, "Nihonium", "Nh", false);
    public static final Element Fl = add(114, 175, -1, null, "Flerovium", "Fl", false);
    public static final Element Mc = add(115, 173, -1, null, "Moscovium", "Mc", false);
    public static final Element Lv = add(116, 177, -1, null, "Livermorium", "Lv", false);
    public static final Element Ts = add(117, 177, -1, null, "Tennessine", "Ts", false);
    public static final Element Og = add(118, 176, -1, null, "Oganesson", "Og", false);

    // fantasy todo Naquadah element names
    public static final Element Tr = add(119, 178, -1, null, "Tritanium", "Tr", false);
    public static final Element Dr = add(120, 180, -1, null, "Duranium", "Dr", false);
    public static final Element Ke = add(125, 198, -1, null, "Trinium", "Ke", false);
    public static final Element Nq = add(174, 352, 140, null, "Naquadah", "Nq", true);
    public static final Element Nq1 = add(174, 354, 140, null, "NaquadahEnriched", "Nq+", true);
    public static final Element Nq2 = add(174, 348, 140, null, "Naquadria", "*Nq*", true);
    public static final Element Nt = add(0, 1000, -1, null, "Neutronium", "Nt", false);
    public static final Element Sp = add(1, 0, -1, null, "Space", "Sp", false);
    public static final Element Ma = add(1, 0, -1, null, "Magic", "Ma", false);

    // TODO CBT:NH Elements
    public static final Element ElementSusanium = add(121, 185, -1, null, "Susanium-306", "Ss", false);
    public static final Element ElementDylantrum = add(122, 187, -1, null, "Dylantrum-309", "Dy", false);
    public static final Element ElementAgrastium = add(123, 190, -1, null, "Agrastium-313", "At", false);
    public static final Element ElementRuslyium = add(124, 194, -1, null, "Ruslyium-318", "Ry", false);
    public static final Element ElementSchrabidium = add(126, 200, -1, null, "Schrabidium-326", "Sa", false);
    public static final Element ElementSolinium = add(126, 201, -1, null, "Solinium-327", "Sa-327", true);
    public static final Element ElementVeridium = add(127, 201, -1, null, "Veridium-328", "Ve", false);
    public static final Element ElementLunarium = add(128, 203, -1, null, "Lunarium-331", "Ln", false);
    public static final Element ElementEtherium = add(129, 206, -1, null, "Etherium-335", "Et", false);
    public static final Element ElementXenynium = add(130, 209, -1, null, "Xenynium-339", "Xy", false);
    public static final Element ElementNeptupitrium = add(131, 211, -1, null, "Neptupitrium-342", "Np", false);
    public static final Element ElementSolimonium = add(132, 214, -1, null, "Solimonium-346", "Sm", false);
    public static final Element ElementAetherium = add(133, 217, -1, null, "Aetherium-350", "Ae", false);
    public static final Element ElementQuasarium = add(134, 220, -1, null, "Quasarium-354", "Qs", false);
    public static final Element ElementLaranium = add(135, 223, -1, null, "Laranium-358", "La", false);
    public static final Element ElementPyranium = add(136, 226, -1, null, "Pyranium-362", "Py", false);
    public static final Element ElementSilisimmunium = add(137, 228, -1, null, "Silisimmunium-365", "Sls", false);
    public static final Element ElementRyneurassium = add(138, 231, -1, null, "Ryneurassium-369", "Ry", false);
    public static final Element ElementSupractinium = add(139, 235, -1, null, "Supractinium-374", "Sc", true);
    public static final Element ElementPuthanium = add(140, 238, -1, null, "Puthanium-378", "Ph", false);
    public static final Element ElementCoslynium = add(141, 241, -1, null, "Coslynium-382", "Cy", false);
    public static final Element ElementYrattasium = add(142, 244, -1, null, "Yrattasium-386", "Ve", false);
    public static final Element ElementRunevaline = add(143, 247, -1, null, "Runevaline-390", "Rv", false);
    public static final Element ElementNeoveline392 = add(144, 248, -1, null, "Neoveline-392", "Nv-392", false);
    public static final Element ElementNeoveline = add(144, 250, -1, null, "Neoveline-394", "Nv", false);
    public static final Element ElementCesarium = add(145, 254, -1, null, "Cesarium-399", "Ce", false);
    public static final Element ElementQuannasarium = add(146, 257, -1, null, "Quannasarium-403", "Q", false);
    public static final Element ElementJadynomium = add(147, 260, -1, null, "Jadynomium-407", "Jd", false);
    public static final Element ElementJaumium = add(148, 264, -1, null, "Jaumium-412", "J", false);
    public static final Element ElementEuronium = add(149, 267, -1, null, "Euronium-416", "Eur", false);
    public static final Element ElementDimosonium = add(150, 271, -1, null, "Dimosonium-421", "Dr", false);
    public static final Element ElementKrassium = add(151, 274, -1, null, "Krassium-425", "Kr", false);
    public static final Element ElementDithermonium = add(152, 278, -1, null, "Dithermonium-430", "Ds", false);
    public static final Element ElementPrassoppurium = add(153, 282, -1, null, "Prassoppurium-435", "Pp", false);
    public static final Element ElementSunatrium = add(154, 285, -1, null, "Sunatrium-439", "Su", false);
    public static final Element ElementBralyium = add(155, 289, -1, null, "Bralyium-444", "By", false);
    public static final Element ElementQuintessium = add(156, 293, -1, null, "Quintessium-449", "Qt", false);
    public static final Element ElementZephyrion = add(157, 297, -1, null, "Zephyrion-454", "Zp", false);
    public static final Element ElementChronotite = add(158, 301, -1, null, "Chronotite-459", "Ct", false);
    public static final Element ElementLuminarite = add(159, 304, -1, null, "Luminarite-463", "Lu", false);
    public static final Element ElementPyrocore = add(160, 308, -1, null, "Pyrocore-468", "Pc", false);
    public static final Element ElementSpectresium = add(161, 313, -1, null, "Spectresium-474", "Sp", false);
    public static final Element ElementAquamimite = add(162, 317, -1, null, "Aquamimite-479", "Aq", false);
    public static final Element ElementTerravium = add(163, 321, -1, null, "Terravium-484", "Tv", false);
    public static final Element ElementPsilunarite = add(164, 325, -1, null, "Psilunarite-489", "Ps", false);
    public static final Element ElementNebulium = add(165, 329, -1, null, "Nebulium-495", "Nb", false);
    public static final Element ElementScytronium = add(166, 334, -1, null, "Scytronium-500", "Scy", false);
    public static final Element ElementModulatum = add(167, 338, -1, null, "Modulatum-505", "Mm", false);
    public static final Element ElementEtharosium = add(168, 342, -1, null, "Etharosium-510", "Es", false);
    public static final Element ElementEchotium = add(169, 347, -1, null, "Echotium-516", "Et", false);
    public static final Element ElementNaquadasson = add(170, 330, -1, null, "Naquadasson-520", "Nq-520", true);
    public static final Element ElementPsychium = add(171, 354, -1, null, "Psychium-354", "Psy", false);
    public static final Element ElementMiasma = add(172, 357, -1, null, "Miasma-357", "Ma", false);
    public static final Element ElementManyullyn = add(173, 359, -1, null, "Manyullyn-359", "My", false);
    public static final Element ElementPromenarium = add(174, 362, -1, null, "Promenarium-362", "Pr", false);
    public static final Element ElementRizzium = add(175, 364, -1, null, "Rizzium-364", "Rz", false);
    public static final Element ElementPhlogiston = add(176, 367, -1, null, "Phlogiston-367", "Ph", false);
    public static final Element ElementCringium = add(177, 369, -1, null, "Cringium-369", "Cg", false);
    public static final Element ElementMixin = add(178, 372, -1, null, "Mixin-372", "Mx", false);
    public static final Element ElementReimusexium = add(179, 375, -1, null, "Reimusexium-375", "Rx", false);
    public static final Element ElementSupersymmetrium = add(180, 377, -1, null, "Supersymmetrium-377", "Susy", false);
    public static final Element ElementRetardium = add(181, 380, -1, null, "Retardium-380", "Rt", false);
    public static final Element ElementCrappium = add(182, 383, -1, null, "Crappium-383", "Cp", false);
    public static final Element ElementDementium = add(183, 386, -1, null, "Dementium-386", "De", false);
    public static final Element ElementAsylium = add(184, 388, -1, null, "Asylium-388", "Ay", false);
    public static final Element ElementCummonium = add(185, 391, -1, null, "Cummonium-391", "Cum", false);
    public static final Element ElementSexium = add(186, 394, -1, null, "Sexium-394", "Sex", false);
    public static final Element ElementDigamma = add(187, 397, -1, null, "Digamma-397", "Di", false);
    public static final Element ElementHyposogen = add(188, 400, -1, null, "Hyposogen-400", "Hs", false);
    public static final Element ElementDinesson = add(189, 401, -1, null, "Dinesson-401", "Dn", false);
    public static final Element ElementSurranium = add(190, 402, -1, null, "Surranium-402", "Srn", false);
    public static final Element ElementBalilium = add(191, 403, -1, null, "Balilium-403", "Bl", false);
    public static final Element ElementCripslanium = add(192, 405, -1, null, "Cripslanium-405", "Ci", false);
    public static final Element ElementReaperium = add(193, 406, -1, null, "Reaperium-406", "Rp", false);
    public static final Element ElementSoransantium = add(194, 407, -1, null, "Soransantium-407", "Sst", false);
    public static final Element ElementCeronium = add(195, 409, -1, null, "Ceronium-409", "Cro", false);
    public static final Element ElementSussonium = add(196, 410, -1, null, "Sussonium-410", "Sss", false);
    public static final Element ElementPlossarinum = add(197, 412, -1, null, "Plossarinum-412", "Pss", false);
    public static final Element ElementQurratanium = add(198, 413, -1, null, "Qurratanium-413", "Qrt", false);
    public static final Element ElementXynthasium = add(199, 414, -1, null, "Xynthasium-414", "Xyn", false);
    public static final Element ElementDerantium = add(200, 416, -1, null, "Derantium-416", "Drt", false);
    public static final Element ElementFalshylium = add(201, 417, -1, null, "Falshylium-417", "Fly", false);
    public static final Element ElementAffassium = add(202, 419, -1, null, "Affassium-419", "Aff", false);
    public static final Element ElementBirudium = add(203, 420, -1, null, "Birudium-420", "Brd", false);
    public static final Element ElementDysansanium = add(204, 421, -1, null, "Dysansanium-421", "Dys", false);
    public static final Element ElementDefransasium = add(205, 423, -1, null, "Defransasium-423", "Def", false);
    public static final Element ElementCollurium = add(206, 424, -1, null, "Collurium-424", "Clr", false);
    public static final Element ElementHypalissorum = add(207, 425, -1, null, "Hypalissorum-425", "Hyp", false);
    public static final Element ElementCavirassanum = add(208, 427, -1, null, "Cavirassanum-427", "Cvs", false);
    public static final Element ElementCivaranum = add(209, 428, -1, null, "Civaranum-428", "Civ", false);
    public static final Element ElementEnfensium = add(210, 430, -1, null, "Enfensium-430", "Enf", false);
    public static final Element ElementSyracusium = add(211, 431, -1, null, "Syracusium-431", "Syr", false);
    public static final Element ElementArdite = add(212, 432, -1, null, "Ardite-432", "Ard", false);
    public static final Element ElementByallurium = add(213, 434, -1, null, "Byallurium-434", "Byl", false);
    public static final Element ElementDenestrium = add(214, 435, -1, null, "Denestrium-435", "Den", false);
    public static final Element ElementGranstatium = add(215, 437, -1, null, "Granstatium-437", "Grn", false);
    public static final Element ElementGropanium = add(216, 438, -1, null, "Gropanium-438", "Grp", false);
    public static final Element ElementHilennium = add(217, 439, -1, null, "Hilennium-439", "Hn", false);
    public static final Element ElementHypillanium = add(218, 441, -1, null, "Hypillanium-441", "Hy", false);
    public static final Element ElementIndarane = add(219, 442, -1, null, "Indarane-442", "Id", false);
    public static final Element ElementInsanae = add(220, 444, -1, null, "Insanae-444", "Is", false);
    public static final Element ElementKarisellinium = add(221, 445, -1, null, "Karisellinium-445", "Ks", false);
    public static final Element ElementKaloyasine = add(222, 447, -1, null, "Kaloyasine-447", "Kys", false);
    public static final Element ElementLonnanium = add(223, 448, -1, null, "Lonnanium-448", "Lnn", false);
    public static final Element ElementMaganate = add(224, 449, -1, null, "Maganate-449", "Mgt", false);
    public static final Element ElementNapplynate = add(225, 450, -1, null, "Napplynate-450", "Nyt", false);
    public static final Element ElementOngorolium = add(226, 452, -1, null, "Ongorolium-452", "Ong", false);
    public static final Element ElementChansanate = add(227, 453, -1, null, "Chansanate-453", "Chn", false);
    public static final Element ElementQualassanium = add(228, 454, -1, null, "Qualassanium-454", "Ql", false);
    public static final Element ElementRavenium = add(229, 456, -1, null, "Ravenium-456", "Rv", false);
    public static final Element ElementSelannate = add(230, 457, -1, null, "Selannate-457", "Sel", false);
    public static final Element ElementPanorium = add(231, 458, -1, null, "Panorium-458", "Pnr", false);
    public static final Element ElementOklahomium = add(232, 460, -1, null, "Oklahomium-460", "Okl", false);
    public static final Element ElementXyanthrozzium = add(233, 461, -1, null, "Xyanthrozzium-461", "Xyz", false);
    public static final Element ElementZenaninum = add(234, 463, -1, null, "Zenaninum-463", "Zn", false);
    public static final Element ElementFanlongossium = add(235, 464, -1, null, "Fanlongossium-464", "Flg", false);
    public static final Element ElementWallonium = add(236, 465, -1, null, "Wallonium-465", "Wl", false);
    public static final Element ElementYantherine = add(237, 467, -1, null, "Yantherine-467", "Ynh", false);
    public static final Element ElementEgeronium = add(238, 468, -1, null, "Egeronium-468", "Egr", false);
    public static final Element ElementEklynium = add(239, 469, -1, null, "Eklynium-469", "Eky", false);
    public static final Element ElementGinsonium = add(240, 471, -1, null, "Ginsonium-471", "Gns", false);
    public static final Element ElementBunnanium = add(241, 472, -1, null, "Bunnanium-472", "Bna", false);
    public static final Element ElementOssononium = add(242, 473, -1, null, "Ossononium-473", "Oss", false);
    public static final Element ElementIandisnomium = add(243, 474, -1, null, "Iandisnomium-474", "Ids", false);
    public static final Element ElementSchrubblium = add(244, 475, -1, null, "Schrubblium-475", "Sch", false);
    public static final Element ElementDrakium = add(245, 476, -1, null, "Drakium-476", "Dra", false);
    public static final Element ElementScreretium = add(246, 477, -1, null, "Screretium-477", "Scr", false);
    public static final Element ElementMikeroonium = add(247, 478, -1, null, "Mikeroonium-478", "Mik", false);
    public static final Element ElementTrulinium = add(248, 479, -1, null, "Trulinium-479", "Tru", false);
    public static final Element ElementNrmotium = add(249, 480, -1, null, "Nrmotium-480", "Nrm", false);
    public static final Element ElementDifferentarium = add(250, 481, -1, null, "Differentarium-481", "Dif", false);
    public static final Element ElementRanstantum = add(251, 482, -1, null, "Ranstantum-482", "Rns", false);
    public static final Element ElementElesttinium = add(252, 483, -1, null, "Elesttinium-483", "Ess", false);
    public static final Element ElementTinduimagnium = add(253, 484, -1, null, "Tinduimagnium-484", "Tnd", false);
    public static final Element ElementAlusxanirium = add(254, 485, -1, null, "Alusxanirium-485", "Alx", false);
    public static final Element ElementAmagsmatmonite = add(255, 486, -1, null, "Amagsmatmonite-486", "Amg", false);
    public static final Element ElementGebmussmaton = add(256, 487, -1, null, "Gebmussmaton-487", "Gbn", false);
    public static final Element ElementBrungrushunium = add(257, 488, -1, null, "Brungrushunium-488", "Brs", false);
    public static final Element ElementCanstolstarium = add(258, 489, -1, null, "Canstolstarium-489", "Cns", false);
    public static final Element ElementDanfihelate = add(259, 490, -1, null, "Danfihelate-490", "Dfi", false);
    public static final Element ElementNirdiagnate = add(260, 491, -1, null, "Nirdiagnate-491", "Nru", false);
    public static final Element ElementMagnate = add(261, 492, -1, null, "Magnate-492", "Mgt", false);
    public static final Element ElementGranium = add(262, 493, -1, null, "Granium-493", "Gnm", false);
    public static final Element ElementShagnium = add(263, 494, -1, null, "Shagnium-494", "Shg", false);
    // TODO Cosmic Neutronium, other Gregicality Elements

    @ZenMethod
    public static Element add(long protons, long neutrons, long halfLifeSeconds, String decayTo, String name,
                              String symbol, boolean isIsotope) {
        Element element = new Element(protons, neutrons, halfLifeSeconds, decayTo, name, symbol, isIsotope);
        elements.put(name, element);
        return element;
    }

    public static List<Element> getAllElements() {
        return Collections.unmodifiableList(new ArrayList<>(elements.values()));
    }

    @ZenMethod("getAllElements")
    public static Element[] getAllElementsCT() {
        return elements.values().toArray(new Element[0]);
    }

    @ZenMethod
    public static Element get(String name) {
        return elements.get(CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, name));
    }
}
