package tbclient.GetDynamicGiftList;

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
public final class GiftList extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_GIFT_ID;
    public static final String DEFAULT_GIFT_NAME = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 4)
    public final ConfigInfo config_info;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer gift_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String gift_name;
    @ProtoField(tag = 3)
    public final GiftZip gift_zip;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public ConfigInfo config_info;
        public Integer gift_id;
        public String gift_name;
        public GiftZip gift_zip;

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
        public Builder(GiftList giftList) {
            super(giftList);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {giftList};
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
            if (giftList == null) {
                return;
            }
            this.gift_id = giftList.gift_id;
            this.gift_name = giftList.gift_name;
            this.gift_zip = giftList.gift_zip;
            this.config_info = giftList.config_info;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GiftList build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new GiftList(this, z, null);
            }
            return (GiftList) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1100788001, "Ltbclient/GetDynamicGiftList/GiftList;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1100788001, "Ltbclient/GetDynamicGiftList/GiftList;");
                return;
            }
        }
        DEFAULT_GIFT_ID = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftList(Builder builder, boolean z) {
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
            Integer num = builder.gift_id;
            if (num == null) {
                this.gift_id = DEFAULT_GIFT_ID;
            } else {
                this.gift_id = num;
            }
            String str = builder.gift_name;
            if (str == null) {
                this.gift_name = "";
            } else {
                this.gift_name = str;
            }
            this.gift_zip = builder.gift_zip;
            this.config_info = builder.config_info;
            return;
        }
        this.gift_id = builder.gift_id;
        this.gift_name = builder.gift_name;
        this.gift_zip = builder.gift_zip;
        this.config_info = builder.config_info;
    }

    public /* synthetic */ GiftList(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
