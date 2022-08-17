package tbclient.GetGiftCommonList;

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
public final class Item extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_GIFT_ID;
    public static final Integer DEFAULT_IOS_COUNT;
    public static final Integer DEFAULT_IOS_PRICE;
    public static final String DEFAULT_IOS_PRODUCT_ID = "";
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_PLAY_URL = "";
    public static final Integer DEFAULT_PRICE;
    public static final String DEFAULT_THUMBNAIL_URL = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer gift_id;
    @ProtoField(tag = 8, type = Message.Datatype.UINT32)
    public final Integer ios_count;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer ios_price;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String ios_product_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String play_url;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer price;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String thumbnail_url;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<Item> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer gift_id;
        public Integer ios_count;
        public Integer ios_price;
        public String ios_product_id;
        public String name;
        public String play_url;
        public Integer price;
        public String thumbnail_url;

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
        public Builder(Item item) {
            super(item);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {item};
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
            if (item == null) {
                return;
            }
            this.gift_id = item.gift_id;
            this.name = item.name;
            this.price = item.price;
            this.thumbnail_url = item.thumbnail_url;
            this.play_url = item.play_url;
            this.ios_product_id = item.ios_product_id;
            this.ios_price = item.ios_price;
            this.ios_count = item.ios_count;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Item build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new Item(this, z, null) : (Item) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1158833310, "Ltbclient/GetGiftCommonList/Item;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1158833310, "Ltbclient/GetGiftCommonList/Item;");
                return;
            }
        }
        DEFAULT_GIFT_ID = 0;
        DEFAULT_PRICE = 0;
        DEFAULT_IOS_PRICE = 0;
        DEFAULT_IOS_COUNT = 0;
    }

    public /* synthetic */ Item(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Item(Builder builder, boolean z) {
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
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            Integer num2 = builder.price;
            if (num2 == null) {
                this.price = DEFAULT_PRICE;
            } else {
                this.price = num2;
            }
            String str2 = builder.thumbnail_url;
            if (str2 == null) {
                this.thumbnail_url = "";
            } else {
                this.thumbnail_url = str2;
            }
            String str3 = builder.play_url;
            if (str3 == null) {
                this.play_url = "";
            } else {
                this.play_url = str3;
            }
            String str4 = builder.ios_product_id;
            if (str4 == null) {
                this.ios_product_id = "";
            } else {
                this.ios_product_id = str4;
            }
            Integer num3 = builder.ios_price;
            if (num3 == null) {
                this.ios_price = DEFAULT_IOS_PRICE;
            } else {
                this.ios_price = num3;
            }
            Integer num4 = builder.ios_count;
            if (num4 == null) {
                this.ios_count = DEFAULT_IOS_COUNT;
                return;
            } else {
                this.ios_count = num4;
                return;
            }
        }
        this.gift_id = builder.gift_id;
        this.name = builder.name;
        this.price = builder.price;
        this.thumbnail_url = builder.thumbnail_url;
        this.play_url = builder.play_url;
        this.ios_product_id = builder.ios_product_id;
        this.ios_price = builder.ios_price;
        this.ios_count = builder.ios_count;
    }
}
