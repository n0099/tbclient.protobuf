package tbclient.FrsPage;

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
public final class SignUser extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final Integer DEFAULT_CONT_SIGN_NUM;
    public static final Integer DEFAULT_COUT_TOTAL_SIGN_NUM;
    public static final Integer DEFAULT_C_SIGN_NUM;
    public static final Integer DEFAULT_HUN_SIGN_NUM;
    public static final Integer DEFAULT_IS_ORG_DISABLED;
    public static final Integer DEFAULT_IS_SIGN_IN;
    public static final Integer DEFAULT_MISS_SIGN_NUM;
    public static final Integer DEFAULT_SIGN_TIME;
    public static final Integer DEFAULT_TOTAL_RESIGN_NUM;
    public static final Long DEFAULT_USER_ID;
    public static final Integer DEFAULT_USER_SIGN_RANK;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer c_sign_num;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer cont_sign_num;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer cout_total_sign_num;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer hun_sign_num;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer is_org_disabled;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer is_sign_in;
    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer miss_sign_num;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer sign_time;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer total_resign_num;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long user_id;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer user_sign_rank;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<SignUser> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer c_sign_num;
        public Integer cont_sign_num;
        public Integer cout_total_sign_num;
        public Integer hun_sign_num;
        public Integer is_org_disabled;
        public Integer is_sign_in;
        public Integer miss_sign_num;
        public Integer sign_time;
        public Integer total_resign_num;
        public Long user_id;
        public Integer user_sign_rank;

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
        public Builder(SignUser signUser) {
            super(signUser);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {signUser};
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
            if (signUser == null) {
                return;
            }
            this.user_id = signUser.user_id;
            this.is_sign_in = signUser.is_sign_in;
            this.user_sign_rank = signUser.user_sign_rank;
            this.sign_time = signUser.sign_time;
            this.cont_sign_num = signUser.cont_sign_num;
            this.cout_total_sign_num = signUser.cout_total_sign_num;
            this.is_org_disabled = signUser.is_org_disabled;
            this.c_sign_num = signUser.c_sign_num;
            this.hun_sign_num = signUser.hun_sign_num;
            this.total_resign_num = signUser.total_resign_num;
            this.miss_sign_num = signUser.miss_sign_num;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SignUser build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new SignUser(this, z, null) : (SignUser) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1714081744, "Ltbclient/FrsPage/SignUser;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1714081744, "Ltbclient/FrsPage/SignUser;");
                return;
            }
        }
        DEFAULT_USER_ID = 0L;
        DEFAULT_IS_SIGN_IN = 0;
        DEFAULT_USER_SIGN_RANK = 0;
        DEFAULT_SIGN_TIME = 0;
        DEFAULT_CONT_SIGN_NUM = 0;
        DEFAULT_COUT_TOTAL_SIGN_NUM = 0;
        DEFAULT_IS_ORG_DISABLED = 0;
        DEFAULT_C_SIGN_NUM = 0;
        DEFAULT_HUN_SIGN_NUM = 0;
        DEFAULT_TOTAL_RESIGN_NUM = 0;
        DEFAULT_MISS_SIGN_NUM = 0;
    }

    public /* synthetic */ SignUser(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignUser(Builder builder, boolean z) {
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
            Integer num = builder.is_sign_in;
            if (num == null) {
                this.is_sign_in = DEFAULT_IS_SIGN_IN;
            } else {
                this.is_sign_in = num;
            }
            Integer num2 = builder.user_sign_rank;
            if (num2 == null) {
                this.user_sign_rank = DEFAULT_USER_SIGN_RANK;
            } else {
                this.user_sign_rank = num2;
            }
            Integer num3 = builder.sign_time;
            if (num3 == null) {
                this.sign_time = DEFAULT_SIGN_TIME;
            } else {
                this.sign_time = num3;
            }
            Integer num4 = builder.cont_sign_num;
            if (num4 == null) {
                this.cont_sign_num = DEFAULT_CONT_SIGN_NUM;
            } else {
                this.cont_sign_num = num4;
            }
            Integer num5 = builder.cout_total_sign_num;
            if (num5 == null) {
                this.cout_total_sign_num = DEFAULT_COUT_TOTAL_SIGN_NUM;
            } else {
                this.cout_total_sign_num = num5;
            }
            Integer num6 = builder.is_org_disabled;
            if (num6 == null) {
                this.is_org_disabled = DEFAULT_IS_ORG_DISABLED;
            } else {
                this.is_org_disabled = num6;
            }
            Integer num7 = builder.c_sign_num;
            if (num7 == null) {
                this.c_sign_num = DEFAULT_C_SIGN_NUM;
            } else {
                this.c_sign_num = num7;
            }
            Integer num8 = builder.hun_sign_num;
            if (num8 == null) {
                this.hun_sign_num = DEFAULT_HUN_SIGN_NUM;
            } else {
                this.hun_sign_num = num8;
            }
            Integer num9 = builder.total_resign_num;
            if (num9 == null) {
                this.total_resign_num = DEFAULT_TOTAL_RESIGN_NUM;
            } else {
                this.total_resign_num = num9;
            }
            Integer num10 = builder.miss_sign_num;
            if (num10 == null) {
                this.miss_sign_num = DEFAULT_MISS_SIGN_NUM;
                return;
            } else {
                this.miss_sign_num = num10;
                return;
            }
        }
        this.user_id = builder.user_id;
        this.is_sign_in = builder.is_sign_in;
        this.user_sign_rank = builder.user_sign_rank;
        this.sign_time = builder.sign_time;
        this.cont_sign_num = builder.cont_sign_num;
        this.cout_total_sign_num = builder.cout_total_sign_num;
        this.is_org_disabled = builder.is_org_disabled;
        this.c_sign_num = builder.c_sign_num;
        this.hun_sign_num = builder.hun_sign_num;
        this.total_resign_num = builder.total_resign_num;
        this.miss_sign_num = builder.miss_sign_num;
    }
}
