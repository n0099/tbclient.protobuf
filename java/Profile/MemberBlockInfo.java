package tbclient.Profile;

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
public final class MemberBlockInfo extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final Integer DEFAULT_IS_AUTO_PAY;
    public static final Integer DEFAULT_IS_BAN;
    public static final Integer DEFAULT_IS_PERMANENT_BAN;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer is_auto_pay;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer is_ban;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer is_permanent_ban;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<MemberBlockInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer is_auto_pay;
        public Integer is_ban;
        public Integer is_permanent_ban;

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
        public Builder(MemberBlockInfo memberBlockInfo) {
            super(memberBlockInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {memberBlockInfo};
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
            if (memberBlockInfo == null) {
                return;
            }
            this.is_permanent_ban = memberBlockInfo.is_permanent_ban;
            this.is_auto_pay = memberBlockInfo.is_auto_pay;
            this.is_ban = memberBlockInfo.is_ban;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public MemberBlockInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new MemberBlockInfo(this, z, null) : (MemberBlockInfo) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-2119296598, "Ltbclient/Profile/MemberBlockInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-2119296598, "Ltbclient/Profile/MemberBlockInfo;");
                return;
            }
        }
        DEFAULT_IS_PERMANENT_BAN = 0;
        DEFAULT_IS_AUTO_PAY = 0;
        DEFAULT_IS_BAN = 0;
    }

    public /* synthetic */ MemberBlockInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemberBlockInfo(Builder builder, boolean z) {
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
            Integer num = builder.is_permanent_ban;
            if (num == null) {
                this.is_permanent_ban = DEFAULT_IS_PERMANENT_BAN;
            } else {
                this.is_permanent_ban = num;
            }
            Integer num2 = builder.is_auto_pay;
            if (num2 == null) {
                this.is_auto_pay = DEFAULT_IS_AUTO_PAY;
            } else {
                this.is_auto_pay = num2;
            }
            Integer num3 = builder.is_ban;
            if (num3 == null) {
                this.is_ban = DEFAULT_IS_BAN;
                return;
            } else {
                this.is_ban = num3;
                return;
            }
        }
        this.is_permanent_ban = builder.is_permanent_ban;
        this.is_auto_pay = builder.is_auto_pay;
        this.is_ban = builder.is_ban;
    }
}
