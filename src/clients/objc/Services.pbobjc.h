// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services.proto

// This CPP symbol can be defined to use imports that match up to the framework
// imports needed when using CocoaPods.
#if !defined(GPB_USE_PROTOBUF_FRAMEWORK_IMPORTS)
 #define GPB_USE_PROTOBUF_FRAMEWORK_IMPORTS 0
#endif

#if GPB_USE_PROTOBUF_FRAMEWORK_IMPORTS
 #import <Protobuf/GPBProtocolBuffers.h>
#else
 #import "GPBProtocolBuffers.h"
#endif

#if GOOGLE_PROTOBUF_OBJC_VERSION < 30002
#error This file was generated by a newer version of protoc which is incompatible with your Protocol Buffer library sources.
#endif
#if 30002 < GOOGLE_PROTOBUF_OBJC_MIN_SUPPORTED_VERSION
#error This file was generated by an older version of protoc which is incompatible with your Protocol Buffer library sources.
#endif

// @@protoc_insertion_point(imports)

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wdeprecated-declarations"

CF_EXTERN_C_BEGIN

@class ResponseError;
@class ResponseStatus;
@class Todo;

NS_ASSUME_NONNULL_BEGIN

#pragma mark - ServicesRoot

/**
 * Exposes the extension registry for this file.
 *
 * The base class provides:
 * @code
 *   + (GPBExtensionRegistry *)extensionRegistry;
 * @endcode
 * which is a @c GPBExtensionRegistry that includes all the extensions defined by
 * this file and all files that it depends on.
 **/
@interface ServicesRoot : GPBRootObject
@end

#pragma mark - AssignRoles

typedef GPB_ENUM(AssignRoles_FieldNumber) {
  AssignRoles_FieldNumber_UserName = 1,
  AssignRoles_FieldNumber_PermissionsArray = 2,
  AssignRoles_FieldNumber_RolesArray = 3,
  AssignRoles_FieldNumber_Meta = 4,
};

@interface AssignRoles : GPBMessage

@property(nonatomic, readwrite, copy, null_resettable) NSString *userName;

@property(nonatomic, readwrite, strong, null_resettable) NSMutableArray<NSString*> *permissionsArray;
/** The number of items in @c permissionsArray without causing the array to be created. */
@property(nonatomic, readonly) NSUInteger permissionsArray_Count;

@property(nonatomic, readwrite, strong, null_resettable) NSMutableArray<NSString*> *rolesArray;
/** The number of items in @c rolesArray without causing the array to be created. */
@property(nonatomic, readonly) NSUInteger rolesArray_Count;

@property(nonatomic, readwrite, strong, null_resettable) NSMutableDictionary<NSString*, NSString*> *meta;
/** The number of items in @c meta without causing the array to be created. */
@property(nonatomic, readonly) NSUInteger meta_Count;

@end

#pragma mark - AssignRolesResponse

typedef GPB_ENUM(AssignRolesResponse_FieldNumber) {
  AssignRolesResponse_FieldNumber_AllRolesArray = 1,
  AssignRolesResponse_FieldNumber_AllPermissionsArray = 2,
  AssignRolesResponse_FieldNumber_Meta = 3,
  AssignRolesResponse_FieldNumber_ResponseStatus = 4,
};

@interface AssignRolesResponse : GPBMessage

@property(nonatomic, readwrite, strong, null_resettable) NSMutableArray<NSString*> *allRolesArray;
/** The number of items in @c allRolesArray without causing the array to be created. */
@property(nonatomic, readonly) NSUInteger allRolesArray_Count;

@property(nonatomic, readwrite, strong, null_resettable) NSMutableArray<NSString*> *allPermissionsArray;
/** The number of items in @c allPermissionsArray without causing the array to be created. */
@property(nonatomic, readonly) NSUInteger allPermissionsArray_Count;

@property(nonatomic, readwrite, strong, null_resettable) NSMutableDictionary<NSString*, NSString*> *meta;
/** The number of items in @c meta without causing the array to be created. */
@property(nonatomic, readonly) NSUInteger meta_Count;

@property(nonatomic, readwrite, strong, null_resettable) ResponseStatus *responseStatus;
/** Test to see if @c responseStatus has been set. */
@property(nonatomic, readwrite) BOOL hasResponseStatus;

@end

#pragma mark - Authenticate

typedef GPB_ENUM(Authenticate_FieldNumber) {
  Authenticate_FieldNumber_Provider = 1,
  Authenticate_FieldNumber_State = 2,
  Authenticate_FieldNumber_OauthToken = 3,
  Authenticate_FieldNumber_OauthVerifier = 4,
  Authenticate_FieldNumber_UserName = 5,
  Authenticate_FieldNumber_Password = 6,
  Authenticate_FieldNumber_RememberMe = 7,
  Authenticate_FieldNumber_Continue_p = 8,
  Authenticate_FieldNumber_ErrorView = 9,
  Authenticate_FieldNumber_Nonce = 10,
  Authenticate_FieldNumber_Uri = 11,
  Authenticate_FieldNumber_Response = 12,
  Authenticate_FieldNumber_Qop = 13,
  Authenticate_FieldNumber_Nc = 14,
  Authenticate_FieldNumber_Cnonce = 15,
  Authenticate_FieldNumber_UseTokenCookie = 16,
  Authenticate_FieldNumber_AccessToken = 17,
  Authenticate_FieldNumber_AccessTokenSecret = 18,
  Authenticate_FieldNumber_Scope = 19,
  Authenticate_FieldNumber_Meta = 20,
};

@interface Authenticate : GPBMessage

@property(nonatomic, readwrite, copy, null_resettable) NSString *provider;

@property(nonatomic, readwrite, copy, null_resettable) NSString *state;

@property(nonatomic, readwrite, copy, null_resettable) NSString *oauthToken;

@property(nonatomic, readwrite, copy, null_resettable) NSString *oauthVerifier;

@property(nonatomic, readwrite, copy, null_resettable) NSString *userName;

@property(nonatomic, readwrite, copy, null_resettable) NSString *password;

@property(nonatomic, readwrite) BOOL rememberMe;

@property(nonatomic, readwrite, copy, null_resettable) NSString *continue_p;

@property(nonatomic, readwrite, copy, null_resettable) NSString *errorView;

@property(nonatomic, readwrite, copy, null_resettable) NSString *nonce;

@property(nonatomic, readwrite, copy, null_resettable) NSString *uri;

@property(nonatomic, readwrite, copy, null_resettable) NSString *response;

@property(nonatomic, readwrite, copy, null_resettable) NSString *qop;

@property(nonatomic, readwrite, copy, null_resettable) NSString *nc;

@property(nonatomic, readwrite, copy, null_resettable) NSString *cnonce;

@property(nonatomic, readwrite) BOOL useTokenCookie;

@property(nonatomic, readwrite, copy, null_resettable) NSString *accessToken;

@property(nonatomic, readwrite, copy, null_resettable) NSString *accessTokenSecret;

@property(nonatomic, readwrite, copy, null_resettable) NSString *scope;

@property(nonatomic, readwrite, strong, null_resettable) NSMutableDictionary<NSString*, NSString*> *meta;
/** The number of items in @c meta without causing the array to be created. */
@property(nonatomic, readonly) NSUInteger meta_Count;

@end

#pragma mark - AuthenticateResponse

typedef GPB_ENUM(AuthenticateResponse_FieldNumber) {
  AuthenticateResponse_FieldNumber_UserId = 1,
  AuthenticateResponse_FieldNumber_SessionId = 2,
  AuthenticateResponse_FieldNumber_UserName = 3,
  AuthenticateResponse_FieldNumber_DisplayName = 4,
  AuthenticateResponse_FieldNumber_ReferrerURL = 5,
  AuthenticateResponse_FieldNumber_BearerToken = 6,
  AuthenticateResponse_FieldNumber_RefreshToken = 7,
  AuthenticateResponse_FieldNumber_ProfileURL = 8,
  AuthenticateResponse_FieldNumber_RolesArray = 9,
  AuthenticateResponse_FieldNumber_PermissionsArray = 10,
  AuthenticateResponse_FieldNumber_ResponseStatus = 11,
  AuthenticateResponse_FieldNumber_Meta = 12,
};

@interface AuthenticateResponse : GPBMessage

@property(nonatomic, readwrite, copy, null_resettable) NSString *userId;

@property(nonatomic, readwrite, copy, null_resettable) NSString *sessionId;

@property(nonatomic, readwrite, copy, null_resettable) NSString *userName;

@property(nonatomic, readwrite, copy, null_resettable) NSString *displayName;

@property(nonatomic, readwrite, copy, null_resettable) NSString *referrerURL;

@property(nonatomic, readwrite, copy, null_resettable) NSString *bearerToken;

@property(nonatomic, readwrite, copy, null_resettable) NSString *refreshToken;

@property(nonatomic, readwrite, copy, null_resettable) NSString *profileURL;

@property(nonatomic, readwrite, strong, null_resettable) NSMutableArray<NSString*> *rolesArray;
/** The number of items in @c rolesArray without causing the array to be created. */
@property(nonatomic, readonly) NSUInteger rolesArray_Count;

@property(nonatomic, readwrite, strong, null_resettable) NSMutableArray<NSString*> *permissionsArray;
/** The number of items in @c permissionsArray without causing the array to be created. */
@property(nonatomic, readonly) NSUInteger permissionsArray_Count;

@property(nonatomic, readwrite, strong, null_resettable) ResponseStatus *responseStatus;
/** Test to see if @c responseStatus has been set. */
@property(nonatomic, readwrite) BOOL hasResponseStatus;

@property(nonatomic, readwrite, strong, null_resettable) NSMutableDictionary<NSString*, NSString*> *meta;
/** The number of items in @c meta without causing the array to be created. */
@property(nonatomic, readonly) NSUInteger meta_Count;

@end

#pragma mark - ConvertSessionToToken

typedef GPB_ENUM(ConvertSessionToToken_FieldNumber) {
  ConvertSessionToToken_FieldNumber_PreserveSession = 1,
  ConvertSessionToToken_FieldNumber_Meta = 2,
};

@interface ConvertSessionToToken : GPBMessage

@property(nonatomic, readwrite) BOOL preserveSession;

@property(nonatomic, readwrite, strong, null_resettable) NSMutableDictionary<NSString*, NSString*> *meta;
/** The number of items in @c meta without causing the array to be created. */
@property(nonatomic, readonly) NSUInteger meta_Count;

@end

#pragma mark - ConvertSessionToTokenResponse

typedef GPB_ENUM(ConvertSessionToTokenResponse_FieldNumber) {
  ConvertSessionToTokenResponse_FieldNumber_Meta = 1,
  ConvertSessionToTokenResponse_FieldNumber_AccessToken = 2,
  ConvertSessionToTokenResponse_FieldNumber_RefreshToken = 3,
  ConvertSessionToTokenResponse_FieldNumber_ResponseStatus = 4,
};

@interface ConvertSessionToTokenResponse : GPBMessage

@property(nonatomic, readwrite, strong, null_resettable) NSMutableDictionary<NSString*, NSString*> *meta;
/** The number of items in @c meta without causing the array to be created. */
@property(nonatomic, readonly) NSUInteger meta_Count;

@property(nonatomic, readwrite, copy, null_resettable) NSString *accessToken;

@property(nonatomic, readwrite, copy, null_resettable) NSString *refreshToken;

@property(nonatomic, readwrite, strong, null_resettable) ResponseStatus *responseStatus;
/** Test to see if @c responseStatus has been set. */
@property(nonatomic, readwrite) BOOL hasResponseStatus;

@end

#pragma mark - CreateTodo

typedef GPB_ENUM(CreateTodo_FieldNumber) {
  CreateTodo_FieldNumber_Title = 1,
  CreateTodo_FieldNumber_Order = 2,
};

@interface CreateTodo : GPBMessage

@property(nonatomic, readwrite, copy, null_resettable) NSString *title;

@property(nonatomic, readwrite) int32_t order;

@end

#pragma mark - CreateTodoResponse

typedef GPB_ENUM(CreateTodoResponse_FieldNumber) {
  CreateTodoResponse_FieldNumber_Result = 1,
  CreateTodoResponse_FieldNumber_ResponseStatus = 2,
};

@interface CreateTodoResponse : GPBMessage

@property(nonatomic, readwrite, strong, null_resettable) Todo *result;
/** Test to see if @c result has been set. */
@property(nonatomic, readwrite) BOOL hasResult;

@property(nonatomic, readwrite, strong, null_resettable) ResponseStatus *responseStatus;
/** Test to see if @c responseStatus has been set. */
@property(nonatomic, readwrite) BOOL hasResponseStatus;

@end

#pragma mark - DeleteTodo

typedef GPB_ENUM(DeleteTodo_FieldNumber) {
  DeleteTodo_FieldNumber_Id_p = 1,
};

@interface DeleteTodo : GPBMessage

@property(nonatomic, readwrite) int64_t id_p;

@end

#pragma mark - DeleteTodos

typedef GPB_ENUM(DeleteTodos_FieldNumber) {
  DeleteTodos_FieldNumber_IdsArray = 1,
};

@interface DeleteTodos : GPBMessage

@property(nonatomic, readwrite, strong, null_resettable) GPBInt64Array *idsArray;
/** The number of items in @c idsArray without causing the array to be created. */
@property(nonatomic, readonly) NSUInteger idsArray_Count;

@end

#pragma mark - EmptyResponse

typedef GPB_ENUM(EmptyResponse_FieldNumber) {
  EmptyResponse_FieldNumber_ResponseStatus = 1,
};

@interface EmptyResponse : GPBMessage

@property(nonatomic, readwrite, strong, null_resettable) ResponseStatus *responseStatus;
/** Test to see if @c responseStatus has been set. */
@property(nonatomic, readwrite) BOOL hasResponseStatus;

@end

#pragma mark - FileContent

typedef GPB_ENUM(FileContent_FieldNumber) {
  FileContent_FieldNumber_Name = 1,
  FileContent_FieldNumber_Type = 2,
  FileContent_FieldNumber_Length = 3,
  FileContent_FieldNumber_Body = 4,
  FileContent_FieldNumber_ResponseStatus = 5,
};

@interface FileContent : GPBMessage

@property(nonatomic, readwrite, copy, null_resettable) NSString *name;

@property(nonatomic, readwrite, copy, null_resettable) NSString *type;

@property(nonatomic, readwrite) int32_t length;

@property(nonatomic, readwrite, copy, null_resettable) NSData *body;

@property(nonatomic, readwrite, strong, null_resettable) ResponseStatus *responseStatus;
/** Test to see if @c responseStatus has been set. */
@property(nonatomic, readwrite) BOOL hasResponseStatus;

@end

#pragma mark - GetAccessToken

typedef GPB_ENUM(GetAccessToken_FieldNumber) {
  GetAccessToken_FieldNumber_RefreshToken = 1,
  GetAccessToken_FieldNumber_UseTokenCookie = 2,
  GetAccessToken_FieldNumber_Meta = 3,
};

@interface GetAccessToken : GPBMessage

@property(nonatomic, readwrite, copy, null_resettable) NSString *refreshToken;

@property(nonatomic, readwrite) BOOL useTokenCookie;

@property(nonatomic, readwrite, strong, null_resettable) NSMutableDictionary<NSString*, NSString*> *meta;
/** The number of items in @c meta without causing the array to be created. */
@property(nonatomic, readonly) NSUInteger meta_Count;

@end

#pragma mark - GetAccessTokenResponse

typedef GPB_ENUM(GetAccessTokenResponse_FieldNumber) {
  GetAccessTokenResponse_FieldNumber_AccessToken = 1,
  GetAccessTokenResponse_FieldNumber_Meta = 2,
  GetAccessTokenResponse_FieldNumber_ResponseStatus = 3,
};

@interface GetAccessTokenResponse : GPBMessage

@property(nonatomic, readwrite, copy, null_resettable) NSString *accessToken;

@property(nonatomic, readwrite, strong, null_resettable) NSMutableDictionary<NSString*, NSString*> *meta;
/** The number of items in @c meta without causing the array to be created. */
@property(nonatomic, readonly) NSUInteger meta_Count;

@property(nonatomic, readwrite, strong, null_resettable) ResponseStatus *responseStatus;
/** Test to see if @c responseStatus has been set. */
@property(nonatomic, readwrite) BOOL hasResponseStatus;

@end

#pragma mark - GetTodo

typedef GPB_ENUM(GetTodo_FieldNumber) {
  GetTodo_FieldNumber_Id_p = 1,
};

@interface GetTodo : GPBMessage

@property(nonatomic, readwrite) int64_t id_p;

@end

#pragma mark - GetTodoResponse

typedef GPB_ENUM(GetTodoResponse_FieldNumber) {
  GetTodoResponse_FieldNumber_Result = 1,
  GetTodoResponse_FieldNumber_ResponseStatus = 2,
};

@interface GetTodoResponse : GPBMessage

@property(nonatomic, readwrite, strong, null_resettable) Todo *result;
/** Test to see if @c result has been set. */
@property(nonatomic, readwrite) BOOL hasResult;

@property(nonatomic, readwrite, strong, null_resettable) ResponseStatus *responseStatus;
/** Test to see if @c responseStatus has been set. */
@property(nonatomic, readwrite) BOOL hasResponseStatus;

@end

#pragma mark - GetTodos

@interface GetTodos : GPBMessage

@end

#pragma mark - GetTodosResponse

typedef GPB_ENUM(GetTodosResponse_FieldNumber) {
  GetTodosResponse_FieldNumber_ResultsArray = 1,
  GetTodosResponse_FieldNumber_ResponseStatus = 2,
};

@interface GetTodosResponse : GPBMessage

@property(nonatomic, readwrite, strong, null_resettable) NSMutableArray<Todo*> *resultsArray;
/** The number of items in @c resultsArray without causing the array to be created. */
@property(nonatomic, readonly) NSUInteger resultsArray_Count;

@property(nonatomic, readwrite, strong, null_resettable) ResponseStatus *responseStatus;
/** Test to see if @c responseStatus has been set. */
@property(nonatomic, readwrite) BOOL hasResponseStatus;

@end

#pragma mark - Hello

typedef GPB_ENUM(Hello_FieldNumber) {
  Hello_FieldNumber_Name = 1,
};

@interface Hello : GPBMessage

@property(nonatomic, readwrite, copy, null_resettable) NSString *name;

@end

#pragma mark - HelloResponse

typedef GPB_ENUM(HelloResponse_FieldNumber) {
  HelloResponse_FieldNumber_Result = 1,
  HelloResponse_FieldNumber_ResponseStatus = 2,
};

@interface HelloResponse : GPBMessage

@property(nonatomic, readwrite, copy, null_resettable) NSString *result;

@property(nonatomic, readwrite, strong, null_resettable) ResponseStatus *responseStatus;
/** Test to see if @c responseStatus has been set. */
@property(nonatomic, readwrite) BOOL hasResponseStatus;

@end

#pragma mark - HelloSecure

typedef GPB_ENUM(HelloSecure_FieldNumber) {
  HelloSecure_FieldNumber_Name = 1,
};

@interface HelloSecure : GPBMessage

@property(nonatomic, readwrite, copy, null_resettable) NSString *name;

@end

#pragma mark - Register

typedef GPB_ENUM(Register_FieldNumber) {
  Register_FieldNumber_UserName = 1,
  Register_FieldNumber_FirstName = 2,
  Register_FieldNumber_LastName = 3,
  Register_FieldNumber_DisplayName = 4,
  Register_FieldNumber_Email = 5,
  Register_FieldNumber_Password = 6,
  Register_FieldNumber_ConfirmPassword = 7,
  Register_FieldNumber_AutoLogin = 8,
  Register_FieldNumber_Continue_p = 9,
  Register_FieldNumber_ErrorView = 10,
  Register_FieldNumber_Meta = 11,
};

@interface Register : GPBMessage

@property(nonatomic, readwrite, copy, null_resettable) NSString *userName;

@property(nonatomic, readwrite, copy, null_resettable) NSString *firstName;

@property(nonatomic, readwrite, copy, null_resettable) NSString *lastName;

@property(nonatomic, readwrite, copy, null_resettable) NSString *displayName;

@property(nonatomic, readwrite, copy, null_resettable) NSString *email;

@property(nonatomic, readwrite, copy, null_resettable) NSString *password;

@property(nonatomic, readwrite, copy, null_resettable) NSString *confirmPassword;

@property(nonatomic, readwrite) BOOL autoLogin;

@property(nonatomic, readwrite, copy, null_resettable) NSString *continue_p;

@property(nonatomic, readwrite, copy, null_resettable) NSString *errorView;

@property(nonatomic, readwrite, strong, null_resettable) NSMutableDictionary<NSString*, NSString*> *meta;
/** The number of items in @c meta without causing the array to be created. */
@property(nonatomic, readonly) NSUInteger meta_Count;

@end

#pragma mark - RegisterResponse

typedef GPB_ENUM(RegisterResponse_FieldNumber) {
  RegisterResponse_FieldNumber_UserId = 1,
  RegisterResponse_FieldNumber_SessionId = 2,
  RegisterResponse_FieldNumber_UserName = 3,
  RegisterResponse_FieldNumber_ReferrerURL = 4,
  RegisterResponse_FieldNumber_BearerToken = 5,
  RegisterResponse_FieldNumber_RefreshToken = 6,
  RegisterResponse_FieldNumber_ResponseStatus = 7,
  RegisterResponse_FieldNumber_Meta = 8,
};

@interface RegisterResponse : GPBMessage

@property(nonatomic, readwrite, copy, null_resettable) NSString *userId;

@property(nonatomic, readwrite, copy, null_resettable) NSString *sessionId;

@property(nonatomic, readwrite, copy, null_resettable) NSString *userName;

@property(nonatomic, readwrite, copy, null_resettable) NSString *referrerURL;

@property(nonatomic, readwrite, copy, null_resettable) NSString *bearerToken;

@property(nonatomic, readwrite, copy, null_resettable) NSString *refreshToken;

@property(nonatomic, readwrite, strong, null_resettable) ResponseStatus *responseStatus;
/** Test to see if @c responseStatus has been set. */
@property(nonatomic, readwrite) BOOL hasResponseStatus;

@property(nonatomic, readwrite, strong, null_resettable) NSMutableDictionary<NSString*, NSString*> *meta;
/** The number of items in @c meta without causing the array to be created. */
@property(nonatomic, readonly) NSUInteger meta_Count;

@end

#pragma mark - ResetTodos

@interface ResetTodos : GPBMessage

@end

#pragma mark - ResponseError

typedef GPB_ENUM(ResponseError_FieldNumber) {
  ResponseError_FieldNumber_ErrorCode = 1,
  ResponseError_FieldNumber_FieldName = 2,
  ResponseError_FieldNumber_Message = 3,
  ResponseError_FieldNumber_Meta = 4,
};

@interface ResponseError : GPBMessage

@property(nonatomic, readwrite, copy, null_resettable) NSString *errorCode;

@property(nonatomic, readwrite, copy, null_resettable) NSString *fieldName;

@property(nonatomic, readwrite, copy, null_resettable) NSString *message;

@property(nonatomic, readwrite, strong, null_resettable) NSMutableDictionary<NSString*, NSString*> *meta;
/** The number of items in @c meta without causing the array to be created. */
@property(nonatomic, readonly) NSUInteger meta_Count;

@end

#pragma mark - ResponseStatus

typedef GPB_ENUM(ResponseStatus_FieldNumber) {
  ResponseStatus_FieldNumber_ErrorCode = 1,
  ResponseStatus_FieldNumber_Message = 2,
  ResponseStatus_FieldNumber_StackTrace = 3,
  ResponseStatus_FieldNumber_ErrorsArray = 4,
  ResponseStatus_FieldNumber_Meta = 5,
};

@interface ResponseStatus : GPBMessage

@property(nonatomic, readwrite, copy, null_resettable) NSString *errorCode;

@property(nonatomic, readwrite, copy, null_resettable) NSString *message;

@property(nonatomic, readwrite, copy, null_resettable) NSString *stackTrace;

@property(nonatomic, readwrite, strong, null_resettable) NSMutableArray<ResponseError*> *errorsArray;
/** The number of items in @c errorsArray without causing the array to be created. */
@property(nonatomic, readonly) NSUInteger errorsArray_Count;

@property(nonatomic, readwrite, strong, null_resettable) NSMutableDictionary<NSString*, NSString*> *meta;
/** The number of items in @c meta without causing the array to be created. */
@property(nonatomic, readonly) NSUInteger meta_Count;

@end

#pragma mark - StreamFiles

typedef GPB_ENUM(StreamFiles_FieldNumber) {
  StreamFiles_FieldNumber_PathsArray = 1,
};

@interface StreamFiles : GPBMessage

@property(nonatomic, readwrite, strong, null_resettable) NSMutableArray<NSString*> *pathsArray;
/** The number of items in @c pathsArray without causing the array to be created. */
@property(nonatomic, readonly) NSUInteger pathsArray_Count;

@end

#pragma mark - StreamServerEvents

typedef GPB_ENUM(StreamServerEvents_FieldNumber) {
  StreamServerEvents_FieldNumber_ChannelsArray = 1,
};

@interface StreamServerEvents : GPBMessage

@property(nonatomic, readwrite, strong, null_resettable) NSMutableArray<NSString*> *channelsArray;
/** The number of items in @c channelsArray without causing the array to be created. */
@property(nonatomic, readonly) NSUInteger channelsArray_Count;

@end

#pragma mark - StreamServerEventsResponse

typedef GPB_ENUM(StreamServerEventsResponse_FieldNumber) {
  StreamServerEventsResponse_FieldNumber_EventId = 1,
  StreamServerEventsResponse_FieldNumber_Channel = 2,
  StreamServerEventsResponse_FieldNumber_Selector = 4,
  StreamServerEventsResponse_FieldNumber_Json = 5,
  StreamServerEventsResponse_FieldNumber_Op = 6,
  StreamServerEventsResponse_FieldNumber_Target = 7,
  StreamServerEventsResponse_FieldNumber_CssSelector = 8,
  StreamServerEventsResponse_FieldNumber_Meta = 9,
  StreamServerEventsResponse_FieldNumber_UserId = 10,
  StreamServerEventsResponse_FieldNumber_DisplayName = 11,
  StreamServerEventsResponse_FieldNumber_ProfileURL = 12,
  StreamServerEventsResponse_FieldNumber_IsAuthenticated = 13,
  StreamServerEventsResponse_FieldNumber_ChannelsArray = 14,
  StreamServerEventsResponse_FieldNumber_CreatedAt = 15,
  StreamServerEventsResponse_FieldNumber_Id_p = 21,
  StreamServerEventsResponse_FieldNumber_UnRegisterURL = 22,
  StreamServerEventsResponse_FieldNumber_UpdateSubscriberURL = 23,
  StreamServerEventsResponse_FieldNumber_HeartbeatURL = 24,
  StreamServerEventsResponse_FieldNumber_HeartbeatIntervalMs = 25,
  StreamServerEventsResponse_FieldNumber_IdleTimeoutMs = 26,
  StreamServerEventsResponse_FieldNumber_ResponseStatus = 30,
};

@interface StreamServerEventsResponse : GPBMessage

@property(nonatomic, readwrite) int64_t eventId;

@property(nonatomic, readwrite, copy, null_resettable) NSString *channel;

@property(nonatomic, readwrite, copy, null_resettable) NSString *selector;

@property(nonatomic, readwrite, copy, null_resettable) NSString *json;

@property(nonatomic, readwrite, copy, null_resettable) NSString *op;

@property(nonatomic, readwrite, copy, null_resettable) NSString *target;

@property(nonatomic, readwrite, copy, null_resettable) NSString *cssSelector;

@property(nonatomic, readwrite, strong, null_resettable) NSMutableDictionary<NSString*, NSString*> *meta;
/** The number of items in @c meta without causing the array to be created. */
@property(nonatomic, readonly) NSUInteger meta_Count;

@property(nonatomic, readwrite, copy, null_resettable) NSString *userId;

@property(nonatomic, readwrite, copy, null_resettable) NSString *displayName;

@property(nonatomic, readwrite, copy, null_resettable) NSString *profileURL;

@property(nonatomic, readwrite) BOOL isAuthenticated;

@property(nonatomic, readwrite, strong, null_resettable) NSMutableArray<NSString*> *channelsArray;
/** The number of items in @c channelsArray without causing the array to be created. */
@property(nonatomic, readonly) NSUInteger channelsArray_Count;

@property(nonatomic, readwrite) int64_t createdAt;

@property(nonatomic, readwrite, copy, null_resettable) NSString *id_p;

@property(nonatomic, readwrite, copy, null_resettable) NSString *unRegisterURL;

@property(nonatomic, readwrite, copy, null_resettable) NSString *updateSubscriberURL;

@property(nonatomic, readwrite, copy, null_resettable) NSString *heartbeatURL;

@property(nonatomic, readwrite) int64_t heartbeatIntervalMs;

@property(nonatomic, readwrite) int64_t idleTimeoutMs;

@property(nonatomic, readwrite, strong, null_resettable) ResponseStatus *responseStatus;
/** Test to see if @c responseStatus has been set. */
@property(nonatomic, readwrite) BOOL hasResponseStatus;

@end

#pragma mark - Todo

typedef GPB_ENUM(Todo_FieldNumber) {
  Todo_FieldNumber_Id_p = 1,
  Todo_FieldNumber_Title = 2,
  Todo_FieldNumber_Order = 3,
  Todo_FieldNumber_Completed = 4,
};

@interface Todo : GPBMessage

@property(nonatomic, readwrite) int64_t id_p;

@property(nonatomic, readwrite, copy, null_resettable) NSString *title;

@property(nonatomic, readwrite) int32_t order;

@property(nonatomic, readwrite) BOOL completed;

@end

#pragma mark - UnAssignRoles

typedef GPB_ENUM(UnAssignRoles_FieldNumber) {
  UnAssignRoles_FieldNumber_UserName = 1,
  UnAssignRoles_FieldNumber_PermissionsArray = 2,
  UnAssignRoles_FieldNumber_RolesArray = 3,
  UnAssignRoles_FieldNumber_Meta = 4,
};

@interface UnAssignRoles : GPBMessage

@property(nonatomic, readwrite, copy, null_resettable) NSString *userName;

@property(nonatomic, readwrite, strong, null_resettable) NSMutableArray<NSString*> *permissionsArray;
/** The number of items in @c permissionsArray without causing the array to be created. */
@property(nonatomic, readonly) NSUInteger permissionsArray_Count;

@property(nonatomic, readwrite, strong, null_resettable) NSMutableArray<NSString*> *rolesArray;
/** The number of items in @c rolesArray without causing the array to be created. */
@property(nonatomic, readonly) NSUInteger rolesArray_Count;

@property(nonatomic, readwrite, strong, null_resettable) NSMutableDictionary<NSString*, NSString*> *meta;
/** The number of items in @c meta without causing the array to be created. */
@property(nonatomic, readonly) NSUInteger meta_Count;

@end

#pragma mark - UnAssignRolesResponse

typedef GPB_ENUM(UnAssignRolesResponse_FieldNumber) {
  UnAssignRolesResponse_FieldNumber_AllRolesArray = 1,
  UnAssignRolesResponse_FieldNumber_AllPermissionsArray = 2,
  UnAssignRolesResponse_FieldNumber_Meta = 3,
  UnAssignRolesResponse_FieldNumber_ResponseStatus = 4,
};

@interface UnAssignRolesResponse : GPBMessage

@property(nonatomic, readwrite, strong, null_resettable) NSMutableArray<NSString*> *allRolesArray;
/** The number of items in @c allRolesArray without causing the array to be created. */
@property(nonatomic, readonly) NSUInteger allRolesArray_Count;

@property(nonatomic, readwrite, strong, null_resettable) NSMutableArray<NSString*> *allPermissionsArray;
/** The number of items in @c allPermissionsArray without causing the array to be created. */
@property(nonatomic, readonly) NSUInteger allPermissionsArray_Count;

@property(nonatomic, readwrite, strong, null_resettable) NSMutableDictionary<NSString*, NSString*> *meta;
/** The number of items in @c meta without causing the array to be created. */
@property(nonatomic, readonly) NSUInteger meta_Count;

@property(nonatomic, readwrite, strong, null_resettable) ResponseStatus *responseStatus;
/** Test to see if @c responseStatus has been set. */
@property(nonatomic, readwrite) BOOL hasResponseStatus;

@end

#pragma mark - UpdateTodo

typedef GPB_ENUM(UpdateTodo_FieldNumber) {
  UpdateTodo_FieldNumber_Id_p = 1,
  UpdateTodo_FieldNumber_Title = 2,
  UpdateTodo_FieldNumber_Order = 3,
  UpdateTodo_FieldNumber_Completed = 4,
};

@interface UpdateTodo : GPBMessage

@property(nonatomic, readwrite) int64_t id_p;

@property(nonatomic, readwrite, copy, null_resettable) NSString *title;

@property(nonatomic, readwrite) int32_t order;

@property(nonatomic, readwrite) BOOL completed;

@end

NS_ASSUME_NONNULL_END

CF_EXTERN_C_END

#pragma clang diagnostic pop

// @@protoc_insertion_point(global_scope)