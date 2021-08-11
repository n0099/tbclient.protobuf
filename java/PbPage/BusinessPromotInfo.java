package tbclient.PbPage;

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
import tbclient.SendCardInfo;
/* loaded from: classes2.dex */
public final class BusinessPromotInfo extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final Integer DEFAULT_IS_HEADLINEPOST;
    public static final Long DEFAULT_IS_PROMOT;
    public static final Integer DEFAULT_IS_S_CARD;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer is_headlinepost;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long is_promot;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer is_s_card;
    @ProtoField(tag = 4)
    public final SendCardInfo send_card_info;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<BusinessPromotInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer is_headlinepost;
        public Long is_promot;
        public Integer is_s_card;
        public SendCardInfo send_card_info;

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
        public Builder(BusinessPromotInfo businessPromotInfo) {
            super(businessPromotInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {businessPromotInfo};
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
            if (businessPromotInfo == null) {
                return;
            }
            this.is_promot = businessPromotInfo.is_promot;
            this.is_headlinepost = businessPromotInfo.is_headlinepost;
            this.is_s_card = businessPromotInfo.is_s_card;
            this.send_card_info = businessPromotInfo.send_card_info;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BusinessPromotInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new BusinessPromotInfo(this, z, null) : (BusinessPromotInfo) invokeZ.objValue;
        }
    }

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(132483076, "Ltbclient/PbPage/BusinessPromotInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(132483076, "Ltbclient/PbPage/BusinessPromotInfo;");
                return;
            }
        }
        DEFAULT_IS_PROMOT = 0L;
        DEFAULT_IS_HEADLINEPOST = 0;
        DEFAULT_IS_S_CARD = 0;
    }

    public /* synthetic */ BusinessPromotInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BusinessPromotInfo(Builder builder, boolean z) {
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
            Long l = builder.is_promot;
            if (l == null) {
                this.is_promot = DEFAULT_IS_PROMOT;
            } else {
                this.is_promot = l;
            }
            Integer num = builder.is_headlinepost;
            if (num == null) {
                this.is_headlinepost = DEFAULT_IS_HEADLINEPOST;
            } else {
                this.is_headlinepost = num;
            }
            Integer num2 = builder.is_s_card;
            if (num2 == null) {
                this.is_s_card = DEFAULT_IS_S_CARD;
            } else {
                this.is_s_card = num2;
            }
            this.send_card_info = builder.send_card_info;
            return;
        }
        this.is_promot = builder.is_promot;
        this.is_headlinepost = builder.is_headlinepost;
        this.is_s_card = builder.is_s_card;
        this.send_card_info = builder.send_card_info;
    }
}
