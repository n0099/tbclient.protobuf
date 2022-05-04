package tbclient;

import com.baidu.android.imsdk.internal.Constants;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InitContext;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.baidu.titan.sdk.runtime.TitanRuntime;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class SimpleUser extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_AGREE_TYPE;
    public static final String DEFAULT_AHEAD_URL = "";
    public static final String DEFAULT_BLOCK_MSG = "";
    public static final Integer DEFAULT_INCOMPLETE_USER;
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_SECUREEMAIL = "";
    public static final String DEFAULT_SECUREMOBIL = "";
    public static final Integer DEFAULT_SHOW_ONLYME;
    public static final Long DEFAULT_USER_ID;
    public static final String DEFAULT_USER_NAME = "";
    public static final String DEFAULT_USER_NICKNAME = "";
    public static final Integer DEFAULT_USER_STATUS;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer agree_type;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String ahead_url;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String block_msg;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer incomplete_user;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String secureemail;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String securemobil;
    @ProtoField(tag = 12, type = Message.Datatype.INT32)
    public final Integer show_onlyme;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long user_id;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String user_name;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String user_nickname;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer user_status;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<SimpleUser> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer agree_type;
        public String ahead_url;
        public String block_msg;
        public Integer incomplete_user;
        public String portrait;
        public String secureemail;
        public String securemobil;
        public Integer show_onlyme;
        public Long user_id;
        public String user_name;
        public String user_nickname;
        public Integer user_status;

        public Builder() {
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                interceptable.invokeUnInit(65536, newInitContext);
                int i = newInitContext.flag;
                if ((i & 1) != 0) {
                    int i2 = i & 2;
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65536, newInitContext);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(SimpleUser simpleUser) {
            super(simpleUser);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {simpleUser};
                interceptable.invokeUnInit(65537, newInitContext);
                int i = newInitContext.flag;
                if ((i & 1) != 0) {
                    int i2 = i & 2;
                    super((Message) newInitContext.callArgs[0]);
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65537, newInitContext);
                    return;
                }
            }
            if (simpleUser == null) {
                return;
            }
            this.user_id = simpleUser.user_id;
            this.user_status = simpleUser.user_status;
            this.secureemail = simpleUser.secureemail;
            this.securemobil = simpleUser.securemobil;
            this.user_name = simpleUser.user_name;
            this.user_nickname = simpleUser.user_nickname;
            this.incomplete_user = simpleUser.incomplete_user;
            this.portrait = simpleUser.portrait;
            this.agree_type = simpleUser.agree_type;
            this.ahead_url = simpleUser.ahead_url;
            this.block_msg = simpleUser.block_msg;
            this.show_onlyme = simpleUser.show_onlyme;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SimpleUser build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new SimpleUser(this, z, null) : (SimpleUser) invokeZ.objValue;
        }
    }

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(184794132, "Ltbclient/SimpleUser;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(184794132, "Ltbclient/SimpleUser;");
                return;
            }
        }
        DEFAULT_USER_ID = 0L;
        DEFAULT_USER_STATUS = 0;
        DEFAULT_INCOMPLETE_USER = 0;
        DEFAULT_AGREE_TYPE = 0;
        DEFAULT_SHOW_ONLYME = 0;
    }

    public /* synthetic */ SimpleUser(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleUser(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65537, newInitContext);
            int i = newInitContext.flag;
            if ((i & 1) != 0) {
                int i2 = i & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65537, newInitContext);
                return;
            }
        }
        if (z) {
            Long l = builder.user_id;
            if (l == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = l;
            }
            Integer num = builder.user_status;
            if (num == null) {
                this.user_status = DEFAULT_USER_STATUS;
            } else {
                this.user_status = num;
            }
            String str = builder.secureemail;
            if (str == null) {
                this.secureemail = "";
            } else {
                this.secureemail = str;
            }
            String str2 = builder.securemobil;
            if (str2 == null) {
                this.securemobil = "";
            } else {
                this.securemobil = str2;
            }
            String str3 = builder.user_name;
            if (str3 == null) {
                this.user_name = "";
            } else {
                this.user_name = str3;
            }
            String str4 = builder.user_nickname;
            if (str4 == null) {
                this.user_nickname = "";
            } else {
                this.user_nickname = str4;
            }
            Integer num2 = builder.incomplete_user;
            if (num2 == null) {
                this.incomplete_user = DEFAULT_INCOMPLETE_USER;
            } else {
                this.incomplete_user = num2;
            }
            String str5 = builder.portrait;
            if (str5 == null) {
                this.portrait = "";
            } else {
                this.portrait = str5;
            }
            Integer num3 = builder.agree_type;
            if (num3 == null) {
                this.agree_type = DEFAULT_AGREE_TYPE;
            } else {
                this.agree_type = num3;
            }
            String str6 = builder.ahead_url;
            if (str6 == null) {
                this.ahead_url = "";
            } else {
                this.ahead_url = str6;
            }
            String str7 = builder.block_msg;
            if (str7 == null) {
                this.block_msg = "";
            } else {
                this.block_msg = str7;
            }
            Integer num4 = builder.show_onlyme;
            if (num4 == null) {
                this.show_onlyme = DEFAULT_SHOW_ONLYME;
                return;
            } else {
                this.show_onlyme = num4;
                return;
            }
        }
        this.user_id = builder.user_id;
        this.user_status = builder.user_status;
        this.secureemail = builder.secureemail;
        this.securemobil = builder.securemobil;
        this.user_name = builder.user_name;
        this.user_nickname = builder.user_nickname;
        this.incomplete_user = builder.incomplete_user;
        this.portrait = builder.portrait;
        this.agree_type = builder.agree_type;
        this.ahead_url = builder.ahead_url;
        this.block_msg = builder.block_msg;
        this.show_onlyme = builder.show_onlyme;
    }
}
