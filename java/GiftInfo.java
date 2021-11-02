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
/* loaded from: classes3.dex */
public final class GiftInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_GIFT_ID;
    public static final String DEFAULT_GIFT_NAME = "";
    public static final String DEFAULT_ICON = "";
    public static final String DEFAULT_LARGE_THUMBNAIL_URL = "";
    public static final Integer DEFAULT_NUM;
    public static final Long DEFAULT_SENDER_ID;
    public static final String DEFAULT_SENDER_NAME = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer gift_id;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String gift_name;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String icon;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String large_thumbnail_url;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer num;
    @ProtoField(tag = 6, type = Message.Datatype.UINT64)
    public final Long sender_id;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String sender_name;

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<GiftInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer gift_id;
        public String gift_name;
        public String icon;
        public String large_thumbnail_url;
        public Integer num;
        public Long sender_id;
        public String sender_name;

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
        public Builder(GiftInfo giftInfo) {
            super(giftInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {giftInfo};
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
            if (giftInfo == null) {
                return;
            }
            this.icon = giftInfo.icon;
            this.num = giftInfo.num;
            this.gift_id = giftInfo.gift_id;
            this.gift_name = giftInfo.gift_name;
            this.large_thumbnail_url = giftInfo.large_thumbnail_url;
            this.sender_id = giftInfo.sender_id;
            this.sender_name = giftInfo.sender_name;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GiftInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new GiftInfo(this, z, null) : (GiftInfo) invokeZ.objValue;
        }
    }

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(453469267, "Ltbclient/GiftInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(453469267, "Ltbclient/GiftInfo;");
                return;
            }
        }
        DEFAULT_NUM = 0;
        DEFAULT_GIFT_ID = 0;
        DEFAULT_SENDER_ID = 0L;
    }

    public /* synthetic */ GiftInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftInfo(Builder builder, boolean z) {
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
            String str = builder.icon;
            if (str == null) {
                this.icon = "";
            } else {
                this.icon = str;
            }
            Integer num = builder.num;
            if (num == null) {
                this.num = DEFAULT_NUM;
            } else {
                this.num = num;
            }
            Integer num2 = builder.gift_id;
            if (num2 == null) {
                this.gift_id = DEFAULT_GIFT_ID;
            } else {
                this.gift_id = num2;
            }
            String str2 = builder.gift_name;
            if (str2 == null) {
                this.gift_name = "";
            } else {
                this.gift_name = str2;
            }
            String str3 = builder.large_thumbnail_url;
            if (str3 == null) {
                this.large_thumbnail_url = "";
            } else {
                this.large_thumbnail_url = str3;
            }
            Long l = builder.sender_id;
            if (l == null) {
                this.sender_id = DEFAULT_SENDER_ID;
            } else {
                this.sender_id = l;
            }
            String str4 = builder.sender_name;
            if (str4 == null) {
                this.sender_name = "";
                return;
            } else {
                this.sender_name = str4;
                return;
            }
        }
        this.icon = builder.icon;
        this.num = builder.num;
        this.gift_id = builder.gift_id;
        this.gift_name = builder.gift_name;
        this.large_thumbnail_url = builder.large_thumbnail_url;
        this.sender_id = builder.sender_id;
        this.sender_name = builder.sender_name;
    }
}
