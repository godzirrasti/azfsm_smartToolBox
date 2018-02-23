final int MSG_BUFFER_SIZE 			=		48;
final int MSG_WAIT_TIME  			=		100;
//Message position and size definitions
final int HEADER_POSITION 			=		0;
final int HEADER_SIZE				=		5;
final int SENDER_CODE_POSITION 		=		5;
final int SENDER_CODE_SIZE			=		1;
final int TYPE_CODE_POSITION		=		6;
final int TYPE_CODE_SIZE			=		1;
final int BOX_ID_POSITION			=		7;
final int BOX_ID_SIZE				=		2;
final int DRAWER_ID_POSITION		=		9;
final int DRAWER_ID_SIZE			=		2;
final int SENSOR_ID_POSITION		=		11;
final int SENSOR_ID_SIZE			=		2;
final int LOCKED_STATUS_POSITION	=		13;
final int LOCKED_STATUS_SIZE		=		1;
final int PRESENT_STATUS_POSITION	=		14;
final int PRESENT_STATUS_SIZE		=		1;
final int BAY_NUMBER_POSITION		=		15;
final int BAY_NUMBER_SIZE			=		3;
final int WWID_POSITION				=		18;
final int WWID_SIZE					=		9;
final int STRING_POSITION			=		27;
final int STRING_SIZE				=		20;
final int END_CHAR_POSITION			=		47;
//Character definitions
final int BOX_ID_ALL				=		99;
final int DRAWER_ID_ALL				=		99;
final int SENSOR_ID_ALL				=		99;
final int WWID_ALL					=		999999999;
final int NO_BOX_ID					=		0;
final String HEADER_STRING			=		"AzFSM";
final char APP_SENDER_CHAR			=		'A';
final char SERVER_SENDER_CHAR		=		'S';
final char BOX_SENDER_CHAR			=		'G';


final char ACK_TYPE_CHAR			=		'A';
final char SG_UNLOCK_TYPE_CHAR		=		'B';
final char SG_LOCK_TYPE_CHAR		=		'C';
final char AS_LOCK_TYPE_CHAR		=		'M';
final char AS_UNLOCK_TYPE_CHAR		=		'N';
final char GS_LOCK_TYPE_CHAR		=		'D';
final char GS_UNLOCK_TYPE_CHAR		=		'E';
final char GS_OPEN_TYPE_CHAR		=		'O';
final char GS_CLOSED_TYPE_CHAR		=		'P';
final char GS_REMOVED_TYPE_CHAR		=		'R';
final char GS_RETURNED_TYPE_CHAR	=		'S';
final char SA_INFO_TYPE_CHAR		=		'I';
final char AS_INFO_TYPE_CHAR		=		'J';
final char AS_REGISTER_TYPE_CHAR 	=		'K';
final char SA_REGISTER_TYPE_CHAR	=		'L';
final char AS_DEREGISTER_TYPE_CHAR	=		'Q';
final char INVALID_TYPE_CHAR		=		'X';
final int UNKNOWN_USER_WWID			=		0;
final char END_CHAR 				=		'\0';