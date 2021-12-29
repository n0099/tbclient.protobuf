package tbclient.GetIconList;

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
/* loaded from: classes5.dex */
public final class Setting extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final Integer DEFAULT_AMOUNT_PAY_LIMIT;
    public static final Integer DEFAULT_VIP_EXTRA_PERCENT;
    public static final Integer DEFAULT_VIP_EXTRA_SWITCH;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer amount_pay_limit;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer vip_extra_percent;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer vip_extra_switch;

    /* loaded from: classes5.dex */
    public static final class Builder extends Message.Builder<Setting> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer amount_pay_limit;
        public Integer vip_extra_percent;
        public Integer vip_extra_switch;

        public Builder() {
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                interceptable.invokeUnInit(65536, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65536, newInitContext);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(Setting setting) {
            super(setting);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {setting};
                interceptable.invokeUnInit(65537, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    super((Message) newInitContext.callArgs[0]);
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65537, newInitContext);
                    return;
                }
            }
            if (setting == null) {
                return;
            }
            this.vip_extra_switch = setting.vip_extra_switch;
            this.vip_extra_percent = setting.vip_extra_percent;
            this.amount_pay_limit = setting.amount_pay_limit;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Setting build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new Setting(this, z, null) : (Setting) invokeZ.objValue;
        }
    }

    /* loaded from: classes5.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1474270825, "Ltbclient/GetIconList/Setting;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1474270825, "Ltbclient/GetIconList/Setting;");
                return;
            }
        }
        DEFAULT_VIP_EXTRA_SWITCH = 0;
        DEFAULT_VIP_EXTRA_PERCENT = 0;
        DEFAULT_AMOUNT_PAY_LIMIT = 0;
    }

    public /* synthetic */ Setting(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Setting(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65537, newInitContext);
            int i2 = newInitContext.flag;
            if ((i2 & 1) != 0) {
                int i3 = i2 & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65537, newInitContext);
                return;
            }
        }
        if (z) {
            Integer num = builder.vip_extra_switch;
            if (num == null) {
                this.vip_extra_switch = DEFAULT_VIP_EXTRA_SWITCH;
            } else {
                this.vip_extra_switch = num;
            }
            Integer num2 = builder.vip_extra_percent;
            if (num2 == null) {
                this.vip_extra_percent = DEFAULT_VIP_EXTRA_PERCENT;
            } else {
                this.vip_extra_percent = num2;
            }
            Integer num3 = builder.amount_pay_limit;
            if (num3 == null) {
                this.amount_pay_limit = DEFAULT_AMOUNT_PAY_LIMIT;
                return;
            } else {
                this.amount_pay_limit = num3;
                return;
            }
        }
        this.vip_extra_switch = builder.vip_extra_switch;
        this.vip_extra_percent = builder.vip_extra_percent;
        this.amount_pay_limit = builder.amount_pay_limit;
    }
}
