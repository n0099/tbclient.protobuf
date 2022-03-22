package tbclient.Bigvip;

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
/* loaded from: classes8.dex */
public final class UserInfoBigVip extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_MESSAGE_ACCEPT;
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_PORTRAITH = "";
    public static final String DEFAULT_USER_DETAIL = "";
    public static final Long DEFAULT_USER_ID;
    public static final String DEFAULT_USER_NAME = "";
    public static final String DEFAULT_USER_TYPE = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer message_accept;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String portraith;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String user_detail;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long user_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String user_name;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String user_type;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<UserInfoBigVip> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer message_accept;
        public String portrait;
        public String portraith;
        public String user_detail;
        public Long user_id;
        public String user_name;
        public String user_type;

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
        public Builder(UserInfoBigVip userInfoBigVip) {
            super(userInfoBigVip);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {userInfoBigVip};
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
            if (userInfoBigVip == null) {
                return;
            }
            this.user_id = userInfoBigVip.user_id;
            this.user_name = userInfoBigVip.user_name;
            this.user_type = userInfoBigVip.user_type;
            this.user_detail = userInfoBigVip.user_detail;
            this.message_accept = userInfoBigVip.message_accept;
            this.portrait = userInfoBigVip.portrait;
            this.portraith = userInfoBigVip.portraith;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UserInfoBigVip build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new UserInfoBigVip(this, z, null) : (UserInfoBigVip) invokeZ.objValue;
        }
    }

    /* loaded from: classes8.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(2074595805, "Ltbclient/Bigvip/UserInfoBigVip;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(2074595805, "Ltbclient/Bigvip/UserInfoBigVip;");
                return;
            }
        }
        DEFAULT_USER_ID = 0L;
        DEFAULT_MESSAGE_ACCEPT = 0;
    }

    public /* synthetic */ UserInfoBigVip(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserInfoBigVip(Builder builder, boolean z) {
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
            String str = builder.user_name;
            if (str == null) {
                this.user_name = "";
            } else {
                this.user_name = str;
            }
            String str2 = builder.user_type;
            if (str2 == null) {
                this.user_type = "";
            } else {
                this.user_type = str2;
            }
            String str3 = builder.user_detail;
            if (str3 == null) {
                this.user_detail = "";
            } else {
                this.user_detail = str3;
            }
            Integer num = builder.message_accept;
            if (num == null) {
                this.message_accept = DEFAULT_MESSAGE_ACCEPT;
            } else {
                this.message_accept = num;
            }
            String str4 = builder.portrait;
            if (str4 == null) {
                this.portrait = "";
            } else {
                this.portrait = str4;
            }
            String str5 = builder.portraith;
            if (str5 == null) {
                this.portraith = "";
                return;
            } else {
                this.portraith = str5;
                return;
            }
        }
        this.user_id = builder.user_id;
        this.user_name = builder.user_name;
        this.user_type = builder.user_type;
        this.user_detail = builder.user_detail;
        this.message_accept = builder.message_accept;
        this.portrait = builder.portrait;
        this.portraith = builder.portraith;
    }
}
