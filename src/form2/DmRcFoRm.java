package form2;

import org.eclipse.swt.widgets.*;
import org.eclipse.swt.*;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;


public class DmRcFoRm {

	protected Shell shlSwtApplication;
	private Text text;
	private Text text_1;
	private Text text_2;
	private Text text_3;
	private Text text_4;
	private Text text_5;
	private Text text_6;
	private Text txtChoose;
	private Text text_7;
	private Text text_8;
	private Text text_9;
	private Text text_10;
	private Text text_11;
	private Text text_12;
	private Text text_13;
	private Text text_14;
	private Text text_15;
	private Text text_16;
	private Text text_17;
	private Text text_18;
	private Text text_19;
	private Text text_20;
	private Text text_21;
	private Text text_22;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			DmRcFoRm window = new DmRcFoRm();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlSwtApplication.open();
		shlSwtApplication.layout();
		while (!shlSwtApplication.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlSwtApplication = new Shell();
		shlSwtApplication.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		shlSwtApplication.setSize(919, 1102);
		shlSwtApplication.setText("SWT Application");
		shlSwtApplication.setLayout(new FormLayout());
		
		text = new Text(shlSwtApplication, SWT.BORDER);
		FormData fd_text = new FormData();
		fd_text.bottom = new FormAttachment(0, 55);
		fd_text.right = new FormAttachment(0, 199);
		fd_text.top = new FormAttachment(0, 35);
		fd_text.left = new FormAttachment(0, 10);
		text.setLayoutData(fd_text);
		
		Label lblName = new Label(shlSwtApplication, SWT.NONE);
		FormData fd_lblName = new FormData();
		fd_lblName.right = new FormAttachment(0, 116);
		fd_lblName.top = new FormAttachment(0, 10);
		fd_lblName.left = new FormAttachment(0, 10);
		lblName.setLayoutData(fd_lblName);
		lblName.setText("1.     NAME*");
		
		Label lblDateOf = new Label(shlSwtApplication, SWT.NONE);
		FormData fd_lblDateOf = new FormData();
		fd_lblDateOf.right = new FormAttachment(0, 199);
		fd_lblDateOf.top = new FormAttachment(0, 61);
		fd_lblDateOf.left = new FormAttachment(0, 10);
		lblDateOf.setLayoutData(fd_lblDateOf);
		lblDateOf.setText("2.     Date Of Birth*");
		
		DateTime dateTime = new DateTime(shlSwtApplication, SWT.BORDER);
		FormData fd_dateTime = new FormData();
		fd_dateTime.top = new FormAttachment(0, 87);
		fd_dateTime.left = new FormAttachment(0, 10);
		dateTime.setLayoutData(fd_dateTime);
		
		Label lblNationality = new Label(shlSwtApplication, SWT.NONE);
		FormData fd_lblNationality = new FormData();
		fd_lblNationality.right = new FormAttachment(0, 160);
		fd_lblNationality.top = new FormAttachment(0, 121);
		fd_lblNationality.left = new FormAttachment(0, 10);
		lblNationality.setLayoutData(fd_lblNationality);
		lblNationality.setText("3.     NATIONALITY*");
		
		text_1 = new Text(shlSwtApplication, SWT.BORDER);
		FormData fd_text_1 = new FormData();
		fd_text_1.right = new FormAttachment(0, 146);
		fd_text_1.top = new FormAttachment(0, 147);
		fd_text_1.left = new FormAttachment(0, 10);
		text_1.setLayoutData(fd_text_1);
		
		text_2 = new Text(shlSwtApplication, SWT.BORDER);
		FormData fd_text_2 = new FormData();
		fd_text_2.right = new FormAttachment(0, 146);
		fd_text_2.top = new FormAttachment(0, 207);
		fd_text_2.left = new FormAttachment(0, 10);
		text_2.setLayoutData(fd_text_2);
		
		Label lblLanguages = new Label(shlSwtApplication, SWT.NONE);
		FormData fd_lblLanguages = new FormData();
		fd_lblLanguages.right = new FormAttachment(0, 139);
		fd_lblLanguages.top = new FormAttachment(0, 181);
		fd_lblLanguages.left = new FormAttachment(0, 10);
		lblLanguages.setLayoutData(fd_lblLanguages);
		lblLanguages.setText("4.     LANGUAGES*");
		
		Label lblDateOf_1 = new Label(shlSwtApplication, SWT.NONE);
		FormData fd_lblDateOf_1 = new FormData();
		fd_lblDateOf_1.right = new FormAttachment(0, 250);
		fd_lblDateOf_1.top = new FormAttachment(0, 239);
		fd_lblDateOf_1.left = new FormAttachment(0, 10);
		lblDateOf_1.setLayoutData(fd_lblDateOf_1);
		lblDateOf_1.setText("5.      DATE OF JOINING DMRC*");
		
		DateTime dateTime_1 = new DateTime(shlSwtApplication, SWT.BORDER);
		FormData fd_dateTime_1 = new FormData();
		fd_dateTime_1.top = new FormAttachment(0, 265);
		fd_dateTime_1.left = new FormAttachment(0, 10);
		dateTime_1.setLayoutData(fd_dateTime_1);
		
		Label lblStatus = new Label(shlSwtApplication, SWT.NONE);
		FormData fd_lblStatus = new FormData();
		fd_lblStatus.right = new FormAttachment(0, 116);
		fd_lblStatus.top = new FormAttachment(0, 303);
		fd_lblStatus.left = new FormAttachment(0, 10);
		lblStatus.setLayoutData(fd_lblStatus);
		lblStatus.setText("6.     STATUS*");
		
		CCombo combo = new CCombo(shlSwtApplication, SWT.BORDER);
		FormData fd_combo = new FormData();
		fd_combo.right = new FormAttachment(0, 139);
		fd_combo.top = new FormAttachment(0, 329);
		fd_combo.left = new FormAttachment(0, 10);
		combo.setLayoutData(fd_combo);
		
		Label lblPresentDesignation = new Label(shlSwtApplication, SWT.NONE);
		FormData fd_lblPresentDesignation = new FormData();
		fd_lblPresentDesignation.right = new FormAttachment(0, 250);
		fd_lblPresentDesignation.top = new FormAttachment(0, 360);
		fd_lblPresentDesignation.left = new FormAttachment(0, 10);
		lblPresentDesignation.setLayoutData(fd_lblPresentDesignation);
		lblPresentDesignation.setText(" 7.      PRESENT DESIGNATION*");
		
		text_3 = new Text(shlSwtApplication, SWT.BORDER);
		FormData fd_text_3 = new FormData();
		fd_text_3.right = new FormAttachment(0, 199);
		fd_text_3.top = new FormAttachment(0, 386);
		fd_text_3.left = new FormAttachment(0, 10);
		text_3.setLayoutData(fd_text_3);
		
		Label lblConcernedHodnamedesignation = new Label(shlSwtApplication, SWT.NONE);
		FormData fd_lblConcernedHodnamedesignation = new FormData();
		fd_lblConcernedHodnamedesignation.right = new FormAttachment(0, 393);
		fd_lblConcernedHodnamedesignation.top = new FormAttachment(0, 418);
		fd_lblConcernedHodnamedesignation.left = new FormAttachment(0, 10);
		lblConcernedHodnamedesignation.setLayoutData(fd_lblConcernedHodnamedesignation);
		lblConcernedHodnamedesignation.setText("8.     CONCERNED HOD(NAME AND DESIGNATION)*");
		
		text_4 = new Text(shlSwtApplication, SWT.BORDER);
		FormData fd_text_4 = new FormData();
		fd_text_4.right = new FormAttachment(0, 273);
		fd_text_4.top = new FormAttachment(0, 447);
		fd_text_4.left = new FormAttachment(0, 10);
		text_4.setLayoutData(fd_text_4);
		
		Label lblNewLabel = new Label(shlSwtApplication, SWT.NONE);
		FormData fd_lblNewLabel = new FormData();
		fd_lblNewLabel.right = new FormAttachment(0, 139);
		fd_lblNewLabel.top = new FormAttachment(0, 479);
		fd_lblNewLabel.left = new FormAttachment(0, 10);
		lblNewLabel.setLayoutData(fd_lblNewLabel);
		lblNewLabel.setText("9.     PAY SCALE*");
		
		CCombo combo_1 = new CCombo(shlSwtApplication, SWT.BORDER);
		FormData fd_combo_1 = new FormData();
		fd_combo_1.right = new FormAttachment(0, 146);
		fd_combo_1.top = new FormAttachment(0, 501);
		fd_combo_1.left = new FormAttachment(0, 17);
		combo_1.setLayoutData(fd_combo_1);
		
		Label lblDateOf_2 = new Label(shlSwtApplication, SWT.NONE);
		FormData fd_lblDateOf_2 = new FormData();
		fd_lblDateOf_2.right = new FormAttachment(0, 273);
		fd_lblDateOf_2.top = new FormAttachment(0, 549);
		fd_lblDateOf_2.left = new FormAttachment(0, 10);
		lblDateOf_2.setLayoutData(fd_lblDateOf_2);
		lblDateOf_2.setText("10.     DATE OF PRESENT GRADE*");
		
		text_5 = new Text(shlSwtApplication, SWT.BORDER);
		FormData fd_text_5 = new FormData();
		fd_text_5.right = new FormAttachment(0, 273);
		fd_text_5.top = new FormAttachment(0, 575);
		fd_text_5.left = new FormAttachment(0, 10);
		text_5.setLayoutData(fd_text_5);
		
		Label lblDateOf_2_1 = new Label(shlSwtApplication, SWT.NONE);
		FormData fd_lblDateOf_2_1 = new FormData();
		fd_lblDateOf_2_1.right = new FormAttachment(0, 273);
		fd_lblDateOf_2_1.top = new FormAttachment(0, 614);
		fd_lblDateOf_2_1.left = new FormAttachment(0, 10);
		lblDateOf_2_1.setLayoutData(fd_lblDateOf_2_1);
		lblDateOf_2_1.setText("11.     BASIC QUALIFICATION*");
		
		text_6 = new Text(shlSwtApplication, SWT.BORDER);
		FormData fd_text_6 = new FormData();
		fd_text_6.right = new FormAttachment(0, 273);
		fd_text_6.top = new FormAttachment(0, 640);
		fd_text_6.left = new FormAttachment(0, 10);
		text_6.setLayoutData(fd_text_6);
		
		Label lblUploadDocuments = new Label(shlSwtApplication, SWT.NONE);
		FormData fd_lblUploadDocuments = new FormData();
		fd_lblUploadDocuments.right = new FormAttachment(0, 182);
		fd_lblUploadDocuments.top = new FormAttachment(0, 672);
		fd_lblUploadDocuments.left = new FormAttachment(0, 20);
		lblUploadDocuments.setLayoutData(fd_lblUploadDocuments);
		lblUploadDocuments.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
		lblUploadDocuments.setText("UPLOAD DOCUMENTS");
		
		txtChoose = new Text(shlSwtApplication, SWT.BORDER);
		FormData fd_txtChoose = new FormData();
		fd_txtChoose.right = new FormAttachment(0, 128);
		fd_txtChoose.top = new FormAttachment(0, 692);
		fd_txtChoose.left = new FormAttachment(0, 50);
		txtChoose.setLayoutData(fd_txtChoose);
		txtChoose.setText("CHOOSE");
		
		Label lblDateOf_2_1_1 = new Label(shlSwtApplication, SWT.NONE);
		FormData fd_lblDateOf_2_1_1 = new FormData();
		fd_lblDateOf_2_1_1.right = new FormAttachment(0, 273);
		fd_lblDateOf_2_1_1.top = new FormAttachment(0, 724);
		fd_lblDateOf_2_1_1.left = new FormAttachment(0, 10);
		lblDateOf_2_1_1.setLayoutData(fd_lblDateOf_2_1_1);
		lblDateOf_2_1_1.setText("12.     ADDITIONAL QUALIFICATION*");
		
		text_7 = new Text(shlSwtApplication, SWT.BORDER);
		FormData fd_text_7 = new FormData();
		fd_text_7.right = new FormAttachment(0, 230);
		fd_text_7.top = new FormAttachment(0, 749);
		fd_text_7.left = new FormAttachment(0, 10);
		text_7.setLayoutData(fd_text_7);
		
		Label lblDateOf_2_1_1_1 = new Label(shlSwtApplication, SWT.NONE);
		FormData fd_lblDateOf_2_1_1_1 = new FormData();
		fd_lblDateOf_2_1_1_1.right = new FormAttachment(0, 273);
		fd_lblDateOf_2_1_1_1.top = new FormAttachment(0, 781);
		fd_lblDateOf_2_1_1_1.left = new FormAttachment(0, 10);
		lblDateOf_2_1_1_1.setLayoutData(fd_lblDateOf_2_1_1_1);
		lblDateOf_2_1_1_1.setText("13.     MEMBERSHIP DETAILS(if any)");
		
		text_8 = new Text(shlSwtApplication, SWT.BORDER);
		FormData fd_text_8 = new FormData();
		fd_text_8.bottom = new FormAttachment(0, 856);
		fd_text_8.right = new FormAttachment(0, 250);
		fd_text_8.top = new FormAttachment(0, 807);
		fd_text_8.left = new FormAttachment(0, 10);
		text_8.setLayoutData(fd_text_8);
		
		Label lblUploadDocuments_1 = new Label(shlSwtApplication, SWT.NONE);
		FormData fd_lblUploadDocuments_1 = new FormData();
		fd_lblUploadDocuments_1.right = new FormAttachment(0, 172);
		fd_lblUploadDocuments_1.top = new FormAttachment(0, 862);
		fd_lblUploadDocuments_1.left = new FormAttachment(0, 10);
		lblUploadDocuments_1.setLayoutData(fd_lblUploadDocuments_1);
		lblUploadDocuments_1.setText("UPLOAD DOCUMENTS");
		lblUploadDocuments_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
		
		text_9 = new Text(shlSwtApplication, SWT.BORDER);
		FormData fd_text_9 = new FormData();
		fd_text_9.right = new FormAttachment(0, 250);
		fd_text_9.top = new FormAttachment(0, 862);
		fd_text_9.left = new FormAttachment(0, 172);
		text_9.setLayoutData(fd_text_9);
		text_9.setText("CHOOSE");
		
		Label lblDateOf_2_1_1_1_1 = new Label(shlSwtApplication, SWT.NONE);
		FormData fd_lblDateOf_2_1_1_1_1 = new FormData();
		fd_lblDateOf_2_1_1_1_1.right = new FormAttachment(0, 199);
		fd_lblDateOf_2_1_1_1_1.top = new FormAttachment(0, 888);
		fd_lblDateOf_2_1_1_1_1.left = new FormAttachment(0, 10);
		lblDateOf_2_1_1_1_1.setLayoutData(fd_lblDateOf_2_1_1_1_1);
		lblDateOf_2_1_1_1_1.setText("14.     Year of Experience*");
		
		Label lblNewLabel_1 = new Label(shlSwtApplication, SWT.NONE);
		FormData fd_lblNewLabel_1 = new FormData();
		fd_lblNewLabel_1.right = new FormAttachment(0, 80);
		fd_lblNewLabel_1.top = new FormAttachment(0, 914);
		fd_lblNewLabel_1.left = new FormAttachment(0, 10);
		lblNewLabel_1.setLayoutData(fd_lblNewLabel_1);
		lblNewLabel_1.setText("Overall-");
		
		text_10 = new Text(shlSwtApplication, SWT.BORDER);
		FormData fd_text_10 = new FormData();
		fd_text_10.bottom = new FormAttachment(0, 934);
		fd_text_10.right = new FormAttachment(0, 226);
		fd_text_10.top = new FormAttachment(0, 914);
		fd_text_10.left = new FormAttachment(0, 64);
		text_10.setLayoutData(fd_text_10);
		
		Label lblNewLabel_1_1 = new Label(shlSwtApplication, SWT.NONE);
		FormData fd_lblNewLabel_1_1 = new FormData();
		fd_lblNewLabel_1_1.right = new FormAttachment(0, 80);
		fd_lblNewLabel_1_1.top = new FormAttachment(0, 940);
		fd_lblNewLabel_1_1.left = new FormAttachment(0, 10);
		lblNewLabel_1_1.setLayoutData(fd_lblNewLabel_1_1);
		lblNewLabel_1_1.setText("Metro-");
		
		text_11 = new Text(shlSwtApplication, SWT.BORDER);
		FormData fd_text_11 = new FormData();
		fd_text_11.bottom = new FormAttachment(0, 960);
		fd_text_11.right = new FormAttachment(0, 230);
		fd_text_11.top = new FormAttachment(0, 940);
		fd_text_11.left = new FormAttachment(0, 68);
		text_11.setLayoutData(fd_text_11);
		
		Label lblNewLabel_1_1_1 = new Label(shlSwtApplication, SWT.NONE);
		FormData fd_lblNewLabel_1_1_1 = new FormData();
		fd_lblNewLabel_1_1_1.right = new FormAttachment(0, 80);
		fd_lblNewLabel_1_1_1.top = new FormAttachment(0, 966);
		fd_lblNewLabel_1_1_1.left = new FormAttachment(0, 10);
		lblNewLabel_1_1_1.setLayoutData(fd_lblNewLabel_1_1_1);
		lblNewLabel_1_1_1.setText("Relevant-");
		
		text_12 = new Text(shlSwtApplication, SWT.BORDER);
		FormData fd_text_12 = new FormData();
		fd_text_12.bottom = new FormAttachment(0, 986);
		fd_text_12.right = new FormAttachment(0, 240);
		fd_text_12.top = new FormAttachment(0, 966);
		fd_text_12.left = new FormAttachment(0, 78);
		text_12.setLayoutData(fd_text_12);
		
		Label lblUploadDocuments_2 = new Label(shlSwtApplication, SWT.NONE);
		FormData fd_lblUploadDocuments_2 = new FormData();
		fd_lblUploadDocuments_2.right = new FormAttachment(0, 182);
		fd_lblUploadDocuments_2.top = new FormAttachment(0, 994);
		fd_lblUploadDocuments_2.left = new FormAttachment(0, 20);
		lblUploadDocuments_2.setLayoutData(fd_lblUploadDocuments_2);
		lblUploadDocuments_2.setText("UPLOAD DOCUMENTS");
		lblUploadDocuments_2.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
		
		text_13 = new Text(shlSwtApplication, SWT.BORDER);
		FormData fd_text_13 = new FormData();
		fd_text_13.right = new FormAttachment(0, 266);
		fd_text_13.top = new FormAttachment(0, 992);
		fd_text_13.left = new FormAttachment(0, 188);
		text_13.setLayoutData(fd_text_13);
		text_13.setText("CHOOSE");
		
		Label lblDateOf_2_1_1_1_1_1 = new Label(shlSwtApplication, SWT.NONE);
		lblDateOf_2_1_1_1_1_1.setText("15.     Number of project Executed/completed*");
		FormData fd_lblDateOf_2_1_1_1_1_1 = new FormData();
		fd_lblDateOf_2_1_1_1_1_1.top = new FormAttachment(lblName, 0, SWT.TOP);
		fd_lblDateOf_2_1_1_1_1_1.bottom = new FormAttachment(lblName, 20);
		fd_lblDateOf_2_1_1_1_1_1.right = new FormAttachment(100, -113);
		lblDateOf_2_1_1_1_1_1.setLayoutData(fd_lblDateOf_2_1_1_1_1_1);
		
		text_14 = new Text(shlSwtApplication, SWT.BORDER);
		FormData fd_text_14 = new FormData();
		fd_text_14.left = new FormAttachment(lblDateOf_2_1_1_1_1_1, 10, SWT.LEFT);
		fd_text_14.top = new FormAttachment(text, 0, SWT.TOP);
		fd_text_14.right = new FormAttachment(lblDateOf_2_1_1_1_1_1, -10, SWT.RIGHT);
		text_14.setLayoutData(fd_text_14);
		
		text_15 = new Text(shlSwtApplication, SWT.BORDER);
		text_15.setText("CHOOSE");
		FormData fd_text_15 = new FormData();
		fd_text_15.top = new FormAttachment(text_14, 7);
		fd_text_15.right = new FormAttachment(lblDateOf_2_1_1_1_1_1, 0, SWT.RIGHT);
		text_15.setLayoutData(fd_text_15);
		
		Label lblUploadDocuments_3 = new Label(shlSwtApplication, SWT.NONE);
		lblUploadDocuments_3.setText("UPLOAD DOCUMENTS");
		lblUploadDocuments_3.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
		FormData fd_lblUploadDocuments_3 = new FormData();
		fd_lblUploadDocuments_3.top = new FormAttachment(text_15, 3, SWT.TOP);
		fd_lblUploadDocuments_3.left = new FormAttachment(lblDateOf_2_1_1_1_1_1, 0, SWT.LEFT);
		lblUploadDocuments_3.setLayoutData(fd_lblUploadDocuments_3);
		
		Label lblDateOf_2_1_1_1_1_2 = new Label(shlSwtApplication, SWT.NONE);
		lblDateOf_2_1_1_1_1_2.setText("16.     Area of Interest*");
		FormData fd_lblDateOf_2_1_1_1_1_2 = new FormData();
		fd_lblDateOf_2_1_1_1_1_2.right = new FormAttachment(lblUploadDocuments_3, 13, SWT.RIGHT);
		fd_lblDateOf_2_1_1_1_1_2.top = new FormAttachment(lblNationality, 0, SWT.TOP);
		fd_lblDateOf_2_1_1_1_1_2.left = new FormAttachment(lblDateOf_2_1_1_1_1_1, 0, SWT.LEFT);
		lblDateOf_2_1_1_1_1_2.setLayoutData(fd_lblDateOf_2_1_1_1_1_2);
		
		text_16 = new Text(shlSwtApplication, SWT.BORDER);
		FormData fd_text_16 = new FormData();
		fd_text_16.right = new FormAttachment(text_14, 0, SWT.RIGHT);
		fd_text_16.top = new FormAttachment(text_1, 0, SWT.TOP);
		fd_text_16.left = new FormAttachment(text_14, 0, SWT.LEFT);
		text_16.setLayoutData(fd_text_16);
		
		Label lblDateOf_2_1_1_1_1_2_1 = new Label(shlSwtApplication, SWT.NONE);
		lblDateOf_2_1_1_1_1_2_1.setText("17.     Willing to go to Foreign Assignment**");
		FormData fd_lblDateOf_2_1_1_1_1_2_1 = new FormData();
		fd_lblDateOf_2_1_1_1_1_2_1.top = new FormAttachment(text_16, 24);
		fd_lblDateOf_2_1_1_1_1_2_1.left = new FormAttachment(lblDateOf_2_1_1_1_1_1, 0, SWT.LEFT);
		lblDateOf_2_1_1_1_1_2_1.setLayoutData(fd_lblDateOf_2_1_1_1_1_2_1);
		
		Label lblDateOf_2_1_1_1_1_2_1_1 = new Label(shlSwtApplication, SWT.NONE);
		lblDateOf_2_1_1_1_1_2_1_1.setText("18.     Any additional information relevant for consultancy*");
		FormData fd_lblDateOf_2_1_1_1_1_2_1_1 = new FormData();
		fd_lblDateOf_2_1_1_1_1_2_1_1.top = new FormAttachment(lblDateOf_2_1_1_1_1_2_1, 66);
		fd_lblDateOf_2_1_1_1_1_2_1_1.left = new FormAttachment(lblDateOf_2_1_1_1_1_1, 0, SWT.LEFT);
		lblDateOf_2_1_1_1_1_2_1_1.setLayoutData(fd_lblDateOf_2_1_1_1_1_2_1_1);
		
		CCombo combo_2 = new CCombo(shlSwtApplication, SWT.BORDER);
		FormData fd_combo_2 = new FormData();
		fd_combo_2.right = new FormAttachment(lblDateOf_2_1_1_1_1_2, 75, SWT.RIGHT);
		fd_combo_2.left = new FormAttachment(lblDateOf_2_1_1_1_1_2, -136);
		fd_combo_2.bottom = new FormAttachment(lblDateOf_1, 0, SWT.BOTTOM);
		combo_2.setLayoutData(fd_combo_2);
		
		text_17 = new Text(shlSwtApplication, SWT.BORDER);
		FormData fd_text_17 = new FormData();
		fd_text_17.right = new FormAttachment(lblDateOf_2_1_1_1_1_1, 0, SWT.RIGHT);
		fd_text_17.bottom = new FormAttachment(combo, 0, SWT.BOTTOM);
		fd_text_17.left = new FormAttachment(text_14, 0, SWT.LEFT);
		text_17.setLayoutData(fd_text_17);
		
		Label lblEmail = new Label(shlSwtApplication, SWT.NONE);
		lblEmail.setText("19.     Email*");
		FormData fd_lblEmail = new FormData();
		fd_lblEmail.top = new FormAttachment(lblPresentDesignation, 0, SWT.TOP);
		fd_lblEmail.left = new FormAttachment(lblPresentDesignation, 229);
		lblEmail.setLayoutData(fd_lblEmail);
		
		text_18 = new Text(shlSwtApplication, SWT.BORDER);
		FormData fd_text_18 = new FormData();
		fd_text_18.right = new FormAttachment(lblDateOf_2_1_1_1_1_1, 0, SWT.RIGHT);
		fd_text_18.top = new FormAttachment(text_3, 0, SWT.TOP);
		fd_text_18.left = new FormAttachment(lblConcernedHodnamedesignation, 96);
		text_18.setLayoutData(fd_text_18);
		
		Label lblAddress = new Label(shlSwtApplication, SWT.NONE);
		lblAddress.setText("20.     Address*");
		FormData fd_lblAddress = new FormData();
		fd_lblAddress.bottom = new FormAttachment(lblConcernedHodnamedesignation, 0, SWT.BOTTOM);
		fd_lblAddress.left = new FormAttachment(lblDateOf_2_1_1_1_1_1, 0, SWT.LEFT);
		lblAddress.setLayoutData(fd_lblAddress);
		
		text_19 = new Text(shlSwtApplication, SWT.BORDER);
		FormData fd_text_19 = new FormData();
		fd_text_19.left = new FormAttachment(text_14, 0, SWT.LEFT);
		fd_text_19.bottom = new FormAttachment(text_4, 0, SWT.BOTTOM);
		fd_text_19.right = new FormAttachment(lblDateOf_2_1_1_1_1_1, 0, SWT.RIGHT);
		text_19.setLayoutData(fd_text_19);
		
		Label lblPhoneNumber = new Label(shlSwtApplication, SWT.NONE);
		lblPhoneNumber.setText("21.     Phone Number*");
		FormData fd_lblPhoneNumber = new FormData();
		fd_lblPhoneNumber.bottom = new FormAttachment(lblNewLabel, 0, SWT.BOTTOM);
		fd_lblPhoneNumber.left = new FormAttachment(lblDateOf_2_1_1_1_1_1, 0, SWT.LEFT);
		lblPhoneNumber.setLayoutData(fd_lblPhoneNumber);
		
		text_20 = new Text(shlSwtApplication, SWT.BORDER);
		FormData fd_text_20 = new FormData();
		fd_text_20.left = new FormAttachment(text_14, 0, SWT.LEFT);
		fd_text_20.top = new FormAttachment(lblPhoneNumber, 15);
		fd_text_20.right = new FormAttachment(lblDateOf_2_1_1_1_1_1, 0, SWT.RIGHT);
		text_20.setLayoutData(fd_text_20);
		
		Label lblAnyAdditional = new Label(shlSwtApplication, SWT.NONE);
		lblAnyAdditional.setText("22.     Any additional information/document (if any)*");
		FormData fd_lblAnyAdditional = new FormData();
		fd_lblAnyAdditional.top = new FormAttachment(text_20, 19);
		fd_lblAnyAdditional.left = new FormAttachment(lblDateOf_2_1_1_1_1_1, 0, SWT.LEFT);
		lblAnyAdditional.setLayoutData(fd_lblAnyAdditional);
		
		Label lblUploadDocuments_3_1 = new Label(shlSwtApplication, SWT.NONE);
		lblUploadDocuments_3_1.setText("UPLOAD DOCUMENTS");
		lblUploadDocuments_3_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
		FormData fd_lblUploadDocuments_3_1 = new FormData();
		fd_lblUploadDocuments_3_1.top = new FormAttachment(lblAnyAdditional, 22);
		fd_lblUploadDocuments_3_1.left = new FormAttachment(lblDateOf_2_1_1_1_1_1, 0, SWT.LEFT);
		lblUploadDocuments_3_1.setLayoutData(fd_lblUploadDocuments_3_1);
		
		text_21 = new Text(shlSwtApplication, SWT.BORDER);
		text_21.setText("CHOOSE");
		FormData fd_text_21 = new FormData();
		fd_text_21.top = new FormAttachment(lblUploadDocuments_3_1, 0, SWT.TOP);
		fd_text_21.left = new FormAttachment(lblUploadDocuments_3_1, 65);
		text_21.setLayoutData(fd_text_21);
		
		Label lblCurriculumVitae = new Label(shlSwtApplication, SWT.NONE);
		lblCurriculumVitae.setText("23.     Curriculum Vitae (CV)* (It is mandatory to upload your CV)*");
		FormData fd_lblCurriculumVitae = new FormData();
		fd_lblCurriculumVitae.top = new FormAttachment(text_21, 32);
		fd_lblCurriculumVitae.right = new FormAttachment(lblAnyAdditional, 0, SWT.RIGHT);
		lblCurriculumVitae.setLayoutData(fd_lblCurriculumVitae);
		
		Label lblNewLabel_2 = new Label(shlSwtApplication, SWT.NONE);
		FormData fd_lblNewLabel_2 = new FormData();
		fd_lblNewLabel_2.top = new FormAttachment(txtChoose, 3, SWT.TOP);
		fd_lblNewLabel_2.left = new FormAttachment(lblDateOf_2_1_1_1_1_1, 0, SWT.LEFT);
		lblNewLabel_2.setLayoutData(fd_lblNewLabel_2);
		lblNewLabel_2.setText("Download file from link, fill the details and upload:");
		
		Label lblUploadDocuments_3_1_1 = new Label(shlSwtApplication, SWT.NONE);
		lblUploadDocuments_3_1_1.setText("UPLOAD DOCUMENTS");
		lblUploadDocuments_3_1_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
		FormData fd_lblUploadDocuments_3_1_1 = new FormData();
		fd_lblUploadDocuments_3_1_1.bottom = new FormAttachment(text_7, 0, SWT.BOTTOM);
		fd_lblUploadDocuments_3_1_1.left = new FormAttachment(text_14, 0, SWT.LEFT);
		lblUploadDocuments_3_1_1.setLayoutData(fd_lblUploadDocuments_3_1_1);
		
		text_22 = new Text(shlSwtApplication, SWT.BORDER);
		text_22.setText("CHOOSE");
		FormData fd_text_22 = new FormData();
		fd_text_22.top = new FormAttachment(text_7, 0, SWT.TOP);
		fd_text_22.left = new FormAttachment(text_21, 0, SWT.LEFT);
		text_22.setLayoutData(fd_text_22);

	}
}
