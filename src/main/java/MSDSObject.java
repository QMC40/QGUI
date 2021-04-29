import javax.swing.*;

public class MSDSObject
{
    private String S1_Identification;
    private String S2_Hazards_Identification;
    private String S3_Composition_Information_Ingredients;
    private String S4_First_Aid_Measures;
    private String S5_Fire_Fighting_Measures;
    private String S6_Accidental_Release_Measures;
    private String S7_Handling_and_Storage;
    private String S8_Exposure_Controls_Personal_Protection;
    private String S9_Physical_and_Chemical_Properties;
    private String S10_Stability_and_Reactivity;
    private String S11_Toxicological_Information;
    private String S12_Ecological_Information;
    private String S13_Disposal_Considerations;
    private String S14_Transport_Information;
    private String S15_Regulatory_Information;
    private String S16_Other_Information;

    public int number_of_sections;
//
    public String[] Array_Of_Section_Information;

    public MSDSObject()
    {
        number_of_sections = 16;
        Array_Of_Section_Information = new String[number_of_sections];

        Array_Of_Section_Information[0] = "This section identifies the chemical on the SDS as well as the recommended uses. It also provides\n" +
                "the essential contact information of the supplier. The required information consists of:\n" +
                "• Product identifier used on the label and any other common names or synonyms by which the\n" +
                "substance is known.\n" +
                "• Name, address, phone number of the manufacturer, importer, or other responsible party, and\n" +
                "emergency phone number.\n" +
                "• Recommended use of the chemical (e.g., a brief description of what it actually does, such\n" +
                "as flame retardant) and any restrictions on use (including recommendations given by the\n" +
                "supplier).";
        Array_Of_Section_Information[1] = "This section identifies the hazards of the chemical presented on the SDS and the appropriate\n" +
                "warning information associated with those hazards. The required information consists of:\n" +
                "• The hazard classification of the chemical (e.g., flammable liquid, category1\n" +
                ").\n" +
                "• Signal word.\n" +
                "• Hazard statement(s).\n" +
                "• Pictograms (the pictograms or hazard symbols may be presented as graphical reproductions\n" +
                "of the symbols in black and white or be a description of the name of the symbol (e.g., skull\n" +
                "and crossbones, flame).\n" +
                "• Precautionary statement(s).\n" +
                "• Description of any hazards not otherwise classified.\n" +
                "• For a mixture that contains an ingredient(s) with unknown toxicity, a statement describing how\n" +
                "much (percentage) of the mixture consists of ingredient(s) with unknown acute toxicity. Please\n" +
                "note that this is a total percentage of the mixture and not tied to the individual ingredient(s).";
        Array_Of_Section_Information[2] = "This section identifies the ingredient(s) contained in the product indicated on the SDS, including\n" +
                "impurities and stabilizing additives. This section includes information on substances, mixtures,\n" +
                "and all chemicals where a trade secret is claimed. The required information consists of:\n" +
                "Substances\n" +
                "• Chemical name.\n" +
                "• Common name and synonyms.\n" +
                "• Chemical Abstracts Service (CAS) number and other unique identifiers.\n" +
                "• Impurities and stabilizing additives, which are themselves classified and which contribute to\n" +
                "the classification of the chemical.\n" +
                "Mixtures\n" +
                "• Same information required for substances.\n" +
                "• The chemical name and concentration (i.e., exact percentage) of all ingredients which are\n" +
                "classified as health hazards and are:\n" +
                "° Present above their cut-off/concentration limits or\n" +
                "° Present a health risk below the cut-off/concentration limits.\n" +
                "• The concentration (exact percentages) of each ingredient must be specified except\n" +
                "concentration ranges may be used in the following situations:\n" +
                "° A trade secret claim is made,\n" +
                "° There is batch-to-batch variation, or\n" +
                "° The SDS is used for a group of substantially similar mixtures.\n" +
                "Chemicals where a trade secret is claimed\n" +
                "• A statement that the specific chemical identity and/or exact percentage (concentration) of\n" +
                "composition has been withheld as a trade secret is required. ";
        Array_Of_Section_Information[3] = "This section describes the initial care that should be given by untrained responders to an\n" +
                "individual who has been exposed to the chemical. The required information consists of:\n" +
                "• Necessary first-aid instructions by relevant routes of exposure (inhalation, skin and eye contact,\n" +
                "and ingestion).\n" +
                "• Description of the most important symptoms or effects, and any symptoms that are acute or\n" +
                "delayed.\n" +
                "• Recommendations for immediate medical care and special treatment needed, when necessary";
        Array_Of_Section_Information[4] = "This section provides recommendations for fighting a fire caused by the chemical. The required\n" +
                "information consists of:\n" +
                "• Recommendations of suitable extinguishing equipment, and information about extinguishing\n" +
                "equipment that is not appropriate for a particular situation.\n" +
                "• Advice on specific hazards that develop from the chemical during the fire, such as any\n" +
                "hazardous combustion products created when the chemical burns.\n" +
                "• Recommendations on special protective equipment or precautions for firefighters.";
        Array_Of_Section_Information[5] = "This section provides recommendations on the appropriate response to spills, leaks, or releases,\n" +
                "including containment and cleanup practices to prevent or minimize exposure to people,\n" +
                "properties, or the environment. It may also include recommendations distinguishing between\n" +
                "responses for large and small spills where the spill volume has a significant impact on the\n" +
                "hazard. The required information may consist of recommendations for:\n" +
                "• Use of personal precautions (such as removal of ignition sources or providing sufficient\n" +
                "ventilation) and protective equipment to prevent the contamination of skin, eyes, and clothing.\n" +
                "• Emergency procedures, including instructions for evacuations, consulting experts when\n" +
                "needed, and appropriate protective clothing.\n" +
                "• Methods and materials used for containment (e.g., covering the drains and capping\n" +
                "procedures).\n" +
                "• Cleanup procedures (e.g., appropriate techniques for neutralization, decontamination, cleaning\n" +
                "or vacuuming; adsorbent materials; and/or equipment required for containment/clean up). ";
        Array_Of_Section_Information[6] = "This section provides guidance on the safe handling practices and conditions for safe storage\n" +
                "of chemicals. The required information consists of:\n" +
                "• Precautions for safe handling, including recommendations for handling incompatible\n" +
                "chemicals, minimizing the release of the chemical into the environment, and providing advice\n" +
                "on general hygiene practices (e.g., eating, drinking, and smoking in work areas is prohibited).\n" +
                "• Recommendations on the conditions for safe storage, including any incompatibilities. Provide\n" +
                "advice on specific storage requirements (e.g., ventilation requirements). ";
        Array_Of_Section_Information[7] = "This section indicates the exposure limits, engineering controls, and personal protective\n" +
                "measures that can be used to minimize worker exposure. The required information consists of:\n" +
                "• OSHA Permissible Exposure Limits (PELs), American Conference of Governmental Industrial\n" +
                "Hygienists (ACGIH) Threshold Limit Values (TLVs), and any other exposure limit used or\n" +
                "recommended by the chemical manufacturer, importer, or employer preparing the safety data\n" +
                "sheet, where available.\n" +
                "• Appropriate engineering controls (e.g., use local exhaust ventilation, or use only in an enclosed\n" +
                "system).\n" +
                "• Recommendations for personal protective measures to prevent illness or injury from exposure\n" +
                "to chemicals, such as personal protective equipment (PPE) (e.g., appropriate types of eye, face,\n" +
                "skin or respiratory protection needed based on hazards and potential exposure).\n" +
                "• Any special requirements for PPE, protective clothing or respirators (e.g., type of glove material,\n" +
                "such as PVC or nitrile rubber gloves; and breakthrough time of the glove material). ";
        Array_Of_Section_Information[8] = "This section identifies physical and chemical properties associated with the substance or mixture.\n" +
                "The minimum required information consists of:\n" +
                "• Appearance (physical state, color, etc.); • Upper/lower flammability or explosive limits;\n" +
                "• Odor; • Vapor pressure;\n" +
                "• Odor threshold; • Vapor density;\n" +
                "• pH; • Relative density;\n" +
                "• Melting point/freezing point; • Solubility(ies);\n" +
                "• Initial boiling point and boiling range; • Partition coefficient: n-octanol/water;\n" +
                "• Flash point; • Auto-ignition temperature;\n" +
                "• Evaporation rate; • Decomposition temperature; and\n" +
                "• Flammability (solid, gas); • Viscosity.\n" +
                "The SDS may not contain every item on the above list because information may not be relevant\n" +
                "or is not available. When this occurs, a notation to that effect must be made for that chemical\n" +
                "property. Manufacturers may also add other relevant properties, such as the dust deflagration\n" +
                "index (Kst) for combustible dust, used to evaluate a dust’s explosive potential. ";
        Array_Of_Section_Information[9] = "This section describes the reactivity hazards of the chemical and the chemical stability\n" +
                "information. This section is broken into three parts: reactivity, chemical stability, and other.\n" +
                "The required information consists of:\n" +
                "Reactivity\n" +
                "• Description of the specific test data for the chemical(s). This data can be for a class or family\n" +
                "of the chemical if such data adequately represent the anticipated hazard of the chemical(s),\n" +
                "where available.\n" +
                "Chemical stability\n" +
                "• Indication of whether the chemical is stable or unstable under normal ambient temperature\n" +
                "and conditions while in storage and being handled.\n" +
                "• Description of any stabilizers that may be needed to maintain chemical stability.\n" +
                "• Indication of any safety issues that may arise should the product change in physical\n" +
                "appearance.\n" +
                "Other\n" +
                "• Indication of the possibility of hazardous reactions, including a statement whether the chemical\n" +
                "will react or polymerize, which could release excess pressure or heat, or create other hazardous\n" +
                "conditions. Also, a description of the conditions under which hazardous reactions may occur.\n" +
                "• List of all conditions that should be avoided (e.g., static discharge, shock, vibrations, or\n" +
                "environmental conditions that may lead to hazardous conditions).\n" +
                "• List of all classes of incompatible materials (e.g., classes of chemicals or specific substances)\n" +
                "with which the chemical could react to produce a hazardous situation.\n" +
                "• List of any known or anticipated hazardous decomposition products that could be produced\n" +
                "because of use, storage, or heating. (Hazardous combustion products should also be included\n" +
                "in Section 5 (Fire-Fighting Measures) of the SDS.)";
        Array_Of_Section_Information[10] = "This section identifies toxicological and health effects information or indicates that such data\n" +
                "are not available. The required information consists of:\n" +
                "• Information on the likely routes of exposure (inhalation, ingestion, skin and eye contact).\n" +
                "The SDS should indicate if the information is unknown.\n" +
                "• Description of the delayed, immediate, or chronic effects from short- and long-term exposure.\n" +
                "• The numerical measures of toxicity (e.g., acute toxicity estimates such as the LD50 (median\n" +
                "lethal dose)) - the estimated amount [of a substance] expected to kill 50% of test animals in a\n" +
                "single dose.\n" +
                "• Description of the symptoms. This description includes the symptoms associated with\n" +
                "exposure to the chemical including symptoms from the lowest to the most severe exposure.\n" +
                "• Indication of whether the chemical is listed in the National Toxicology Program (NTP)\n" +
                "Report on Carcinogens (latest edition) or has been found to be a potential carcinogen in the\n" +
                "International Agency for Research on Cancer (IARC) Monographs (latest editions) or found\n" +
                "to be a potential carcinogen by OSHA";
        Array_Of_Section_Information[11] = "This section provides information to evaluate the environmental impact of the chemical(s) if it\n" +
                "were released to the environment. The information may include:\n" +
                "• Data from toxicity tests performed on aquatic and/or terrestrial organisms, where available\n" +
                "(e.g., acute or chronic aquatic toxicity data for fish, algae, crustaceans, and other plants; toxicity\n" +
                "data on birds, bees, plants).\n" +
                "• Whether there is a potential for the chemical to persist and degrade in the environment either\n" +
                "through biodegradation or other processes, such as oxidation or hydrolysis.\n" +
                "• Results of tests of bioaccumulation potential, making reference to the octanol-water partition\n" +
                "coefficient (Kow) and the bioconcentration factor (BCF), where available.\n" +
                "• The potential for a substance to move from the soil to the groundwater (indicate results from\n" +
                "adsorption studies or leaching studies).\n" +
                "• Other adverse effects (e.g., environmental fate, ozone layer depletion potential, photochemical\n" +
                "ozone creation potential, endocrine disrupting potential, and/or global warming potential).";
        Array_Of_Section_Information[12] = "This section provides guidance on proper disposal practices, recycling or reclamation of the\n" +
                "chemical(s) or its container, and safe handling practices. To minimize exposure, this section\n" +
                "should also refer the reader to Section 8 (Exposure Controls/Personal Protection) of the SDS.\n" +
                "The information may include:\n" +
                "• Description of appropriate disposal containers to use.\n" +
                "• Recommendations of appropriate disposal methods to employ.\n" +
                "• Description of the physical and chemical properties that may affect disposal activities.\n" +
                "• Language discouraging sewage disposal.\n" +
                "• Any special precautions for landfills or incineration activities.";
        Array_Of_Section_Information[13] = "This section provides guidance on classification information for shipping and transporting of\n" +
                "hazardous chemical(s) by road, air, rail, or sea. The information may include:\n" +
                "• UN number (i.e., four-figure identification number of the substance)2\n" +
                ".\n" +
                "• UN proper shipping name2\n" +
                ".\n" +
                "• Transport hazard class(es)2\n" +
                ".\n" +
                "• Packing group number, if applicable, based on the degree of hazard2\n" +
                ".\n" +
                "• Environmental hazards (e.g., identify if it is a marine pollutant according to the International\n" +
                "Maritime Dangerous Goods Code (IMDG Code)).\n" +
                "• Guidance on transport in bulk (according to Annex II of MARPOL 73/783\n" +
                " and the International\n" +
                "Code for the Construction and Equipment of Ships Carrying Dangerous Chemicals in Bulk\n" +
                "(International Bulk Chemical Code (IBC Code)).\n" +
                "• Any special precautions which an employee should be aware of or needs to comply with, in\n" +
                "connection with transport or conveyance either within or outside their premises (indicate\n" +
                "when information is not available).";
        Array_Of_Section_Information[14] = "This section identifies the safety, health, and environmental regulations specific for the product\n" +
                "that is not indicated anywhere else on the SDS. The information may include:\n" +
                "• Any national and/or regional regulatory information of the chemical or mixtures (including any\n" +
                "OSHA, Department of Transportation, Environmental Protection Agency, or Consumer Product\n" +
                "Safety Commission regulations).";
        Array_Of_Section_Information[15] = "This section indicates when the SDS was prepared or when the last known revision was made.\n" +
                "The SDS may also state where the changes have been made to the previous version. You may\n" +
                "wish to contact the supplier for an explanation of the changes. Other useful information also may\n" +
                "be included here.";

    }

    public void Ask_and_Set_All_Input()
    {
        this.S1_Identification = JOptionPane.showInputDialog(null,Array_Of_Section_Information[0],"Section 1",JOptionPane.INFORMATION_MESSAGE );
        this.S2_Hazards_Identification = JOptionPane.showInputDialog(null,Array_Of_Section_Information[1],"Section 2",JOptionPane.INFORMATION_MESSAGE );
        this.S3_Composition_Information_Ingredients = JOptionPane.showInputDialog(null,Array_Of_Section_Information[2],"Section 3",JOptionPane.INFORMATION_MESSAGE );
        this.S4_First_Aid_Measures = JOptionPane.showInputDialog(null,Array_Of_Section_Information[3],"Section 4",JOptionPane.INFORMATION_MESSAGE );
        this.S5_Fire_Fighting_Measures = JOptionPane.showInputDialog(null,Array_Of_Section_Information[4],"Section 5",JOptionPane.INFORMATION_MESSAGE );
        this.S6_Accidental_Release_Measures = JOptionPane.showInputDialog(null,Array_Of_Section_Information[5],"Section 6",JOptionPane.INFORMATION_MESSAGE );
        this.S7_Handling_and_Storage = JOptionPane.showInputDialog(null,Array_Of_Section_Information[6],"Section 7",JOptionPane.INFORMATION_MESSAGE );
        this.S8_Exposure_Controls_Personal_Protection = JOptionPane.showInputDialog(null,Array_Of_Section_Information[7],"Section 8",JOptionPane.INFORMATION_MESSAGE );
        this.S9_Physical_and_Chemical_Properties = JOptionPane.showInputDialog(null,Array_Of_Section_Information[8],"Section 9",JOptionPane.INFORMATION_MESSAGE );
        this.S10_Stability_and_Reactivity = JOptionPane.showInputDialog(null,Array_Of_Section_Information[9],"Section 10",JOptionPane.INFORMATION_MESSAGE );
        this.S11_Toxicological_Information = JOptionPane.showInputDialog(null,Array_Of_Section_Information[10],"Section 11",JOptionPane.INFORMATION_MESSAGE );
        this.S12_Ecological_Information = JOptionPane.showInputDialog(null,Array_Of_Section_Information[11],"Section 12",JOptionPane.INFORMATION_MESSAGE );
        this.S13_Disposal_Considerations = JOptionPane.showInputDialog(null,Array_Of_Section_Information[12],"Section 13",JOptionPane.INFORMATION_MESSAGE );
        this.S14_Transport_Information = JOptionPane.showInputDialog(null,Array_Of_Section_Information[13],"Section 14",JOptionPane.INFORMATION_MESSAGE );
        this.S15_Regulatory_Information = JOptionPane.showInputDialog(null,Array_Of_Section_Information[14],"Section 15",JOptionPane.INFORMATION_MESSAGE );
        this.S16_Other_Information = JOptionPane.showInputDialog(null,Array_Of_Section_Information[15],"Section 16",JOptionPane.INFORMATION_MESSAGE );

    }

    public String getS1_Identification() {
        return S1_Identification;
    }

    public void setS1_Identification(String s1_Identification) {
        S1_Identification = s1_Identification;
    }

    public String getS2_Hazards_Identification() {
        return S2_Hazards_Identification;
    }

    public void setS2_Hazards_Identification(String s2_Hazards_Identification) {
        S2_Hazards_Identification = s2_Hazards_Identification;
    }

    public String getS3_Composition_Information_Ingredients() {
        return S3_Composition_Information_Ingredients;
    }

    public void setS3_Composition_Information_Ingredients(String s3_Composition_Information_Ingredients) {
        S3_Composition_Information_Ingredients = s3_Composition_Information_Ingredients;
    }

    public String getS4_First_Aid_Measures() {
        return S4_First_Aid_Measures;
    }

    public void setS4_First_Aid_Measures(String s4_First_Aid_Measures) {
        S4_First_Aid_Measures = s4_First_Aid_Measures;
    }

    public String getS5_Fire_Fighting_Measures() {
        return S5_Fire_Fighting_Measures;
    }

    public void setS5_Fire_Fighting_Measures(String s5_Fire_Fighting_Measures) {
        S5_Fire_Fighting_Measures = s5_Fire_Fighting_Measures;
    }

    public String getS6_Accidental_Release_Measures() {
        return S6_Accidental_Release_Measures;
    }

    public void setS6_Accidental_Release_Measures(String s6_Accidental_Release_Measures) {
        S6_Accidental_Release_Measures = s6_Accidental_Release_Measures;
    }

    public String getS7_Handling_and_Storage() {
        return S7_Handling_and_Storage;
    }

    public void setS7_Handling_and_Storage(String s7_Handling_and_Storage) {
        S7_Handling_and_Storage = s7_Handling_and_Storage;
    }

    public String getS8_Exposure_Controls_Personal_Protection() {
        return S8_Exposure_Controls_Personal_Protection;
    }

    public void setS8_Exposure_Controls_Personal_Protection(String s8_Exposure_Controls_Personal_Protection) {
        S8_Exposure_Controls_Personal_Protection = s8_Exposure_Controls_Personal_Protection;
    }

    public String getS9_Physical_and_Chemical_Properties() {
        return S9_Physical_and_Chemical_Properties;
    }

    public void setS9_Physical_and_Chemical_Properties(String s9_Physical_and_Chemical_Properties) {
        S9_Physical_and_Chemical_Properties = s9_Physical_and_Chemical_Properties;
    }

    public String getS10_Stability_and_Reactivity() {
        return S10_Stability_and_Reactivity;
    }

    public void setS10_Stability_and_Reactivity(String s10_Stability_and_Reactivity) {
        S10_Stability_and_Reactivity = s10_Stability_and_Reactivity;
    }

    public String getS11_Toxicological_Information() {
        return S11_Toxicological_Information;
    }

    public void setS11_Toxicological_Information(String s11_Toxicological_Information) {
        S11_Toxicological_Information = s11_Toxicological_Information;
    }

    public String getS12_Ecological_Information() {
        return S12_Ecological_Information;
    }

    public void setS12_Ecological_Information(String s12_Ecological_Information) {
        S12_Ecological_Information = s12_Ecological_Information;
    }

    public String getS13_Disposal_Considerations() {
        return S13_Disposal_Considerations;
    }

    public void setS13_Disposal_Considerations(String s13_Disposal_Considerations) {
        S13_Disposal_Considerations = s13_Disposal_Considerations;
    }

    public String getS14_Transport_Information() {
        return S14_Transport_Information;
    }

    public void setS14_Transport_Information(String s14_Transport_Information) {
        S14_Transport_Information = s14_Transport_Information;
    }

    public String getS15_Regulatory_Information() {
        return S15_Regulatory_Information;
    }

    public void setS15_Regulatory_Information(String s15_Regulatory_Information) {
        S15_Regulatory_Information = s15_Regulatory_Information;
    }

    public String getS16_Other_Information() {
        return S16_Other_Information;
    }

    public void setS16_Other_Information(String s16_Other_Information) {
        S16_Other_Information = s16_Other_Information;
    }
}
