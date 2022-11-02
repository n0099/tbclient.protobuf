package tbclient.GetVipInfo;

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
public final class VipUpgrade extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_BUTTON = "";
    public static final String DEFAULT_CARD_ID = "";
    public static final String DEFAULT_EXPIRE = "";
    public static final String DEFAULT_LINK = "";
    public static final Integer DEFAULT_NORMAL;
    public static final Integer DEFAULT_PAY;
    public static final String DEFAULT_SVIP = "";
    public static final String DEFAULT_TEXT = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String button;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String card_id;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String expire;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String link;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer normal;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer pay;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String svip;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String text;

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<VipUpgrade> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String button;
        public String card_id;
        public String expire;
        public String link;
        public Integer normal;
        public Integer pay;
        public String svip;
        public String text;

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
        public Builder(VipUpgrade vipUpgrade) {
            super(vipUpgrade);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {vipUpgrade};
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
            if (vipUpgrade == null) {
                return;
            }
            this.normal = vipUpgrade.normal;
            this.pay = vipUpgrade.pay;
            this.text = vipUpgrade.text;
            this.button = vipUpgrade.button;
            this.link = vipUpgrade.link;
            this.svip = vipUpgrade.svip;
            this.expire = vipUpgrade.expire;
            this.card_id = vipUpgrade.card_id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VipUpgrade build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new VipUpgrade(this, z, null);
            }
            return (VipUpgrade) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(49772876, "Ltbclient/GetVipInfo/VipUpgrade;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(49772876, "Ltbclient/GetVipInfo/VipUpgrade;");
                return;
            }
        }
        DEFAULT_NORMAL = 0;
        DEFAULT_PAY = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VipUpgrade(Builder builder, boolean z) {
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
            Integer num = builder.normal;
            if (num == null) {
                this.normal = DEFAULT_NORMAL;
            } else {
                this.normal = num;
            }
            Integer num2 = builder.pay;
            if (num2 == null) {
                this.pay = DEFAULT_PAY;
            } else {
                this.pay = num2;
            }
            String str = builder.text;
            if (str == null) {
                this.text = "";
            } else {
                this.text = str;
            }
            String str2 = builder.button;
            if (str2 == null) {
                this.button = "";
            } else {
                this.button = str2;
            }
            String str3 = builder.link;
            if (str3 == null) {
                this.link = "";
            } else {
                this.link = str3;
            }
            String str4 = builder.svip;
            if (str4 == null) {
                this.svip = "";
            } else {
                this.svip = str4;
            }
            String str5 = builder.expire;
            if (str5 == null) {
                this.expire = "";
            } else {
                this.expire = str5;
            }
            String str6 = builder.card_id;
            if (str6 == null) {
                this.card_id = "";
                return;
            } else {
                this.card_id = str6;
                return;
            }
        }
        this.normal = builder.normal;
        this.pay = builder.pay;
        this.text = builder.text;
        this.button = builder.button;
        this.link = builder.link;
        this.svip = builder.svip;
        this.expire = builder.expire;
        this.card_id = builder.card_id;
    }

    public /* synthetic */ VipUpgrade(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
