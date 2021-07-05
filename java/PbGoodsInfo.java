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
/* loaded from: classes10.dex */
public final class PbGoodsInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_GOODS_FROM = "";
    public static final String DEFAULT_GOODS_IMAGE = "";
    public static final String DEFAULT_GOODS_PRICE = "";
    public static final String DEFAULT_GOODS_TITLE = "";
    public static final String DEFAULT_GOODS_URL = "";
    public static final String DEFAULT_GOODS_URL_H5 = "";
    public static final Integer DEFAULT_SORT;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String goods_from;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String goods_image;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String goods_price;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String goods_title;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String goods_url;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String goods_url_h5;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer sort;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<PbGoodsInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String goods_from;
        public String goods_image;
        public String goods_price;
        public String goods_title;
        public String goods_url;
        public String goods_url_h5;
        public Integer sort;

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
        public Builder(PbGoodsInfo pbGoodsInfo) {
            super(pbGoodsInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {pbGoodsInfo};
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
            if (pbGoodsInfo == null) {
                return;
            }
            this.goods_title = pbGoodsInfo.goods_title;
            this.goods_image = pbGoodsInfo.goods_image;
            this.goods_price = pbGoodsInfo.goods_price;
            this.goods_url = pbGoodsInfo.goods_url;
            this.sort = pbGoodsInfo.sort;
            this.goods_from = pbGoodsInfo.goods_from;
            this.goods_url_h5 = pbGoodsInfo.goods_url_h5;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PbGoodsInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new PbGoodsInfo(this, z, null) : (PbGoodsInfo) invokeZ.objValue;
        }
    }

    /* loaded from: classes10.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-2003469037, "Ltbclient/PbGoodsInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-2003469037, "Ltbclient/PbGoodsInfo;");
                return;
            }
        }
        DEFAULT_SORT = 0;
    }

    public /* synthetic */ PbGoodsInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PbGoodsInfo(Builder builder, boolean z) {
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
            String str = builder.goods_title;
            if (str == null) {
                this.goods_title = "";
            } else {
                this.goods_title = str;
            }
            String str2 = builder.goods_image;
            if (str2 == null) {
                this.goods_image = "";
            } else {
                this.goods_image = str2;
            }
            String str3 = builder.goods_price;
            if (str3 == null) {
                this.goods_price = "";
            } else {
                this.goods_price = str3;
            }
            String str4 = builder.goods_url;
            if (str4 == null) {
                this.goods_url = "";
            } else {
                this.goods_url = str4;
            }
            Integer num = builder.sort;
            if (num == null) {
                this.sort = DEFAULT_SORT;
            } else {
                this.sort = num;
            }
            String str5 = builder.goods_from;
            if (str5 == null) {
                this.goods_from = "";
            } else {
                this.goods_from = str5;
            }
            String str6 = builder.goods_url_h5;
            if (str6 == null) {
                this.goods_url_h5 = "";
                return;
            } else {
                this.goods_url_h5 = str6;
                return;
            }
        }
        this.goods_title = builder.goods_title;
        this.goods_image = builder.goods_image;
        this.goods_price = builder.goods_price;
        this.goods_url = builder.goods_url;
        this.sort = builder.sort;
        this.goods_from = builder.goods_from;
        this.goods_url_h5 = builder.goods_url_h5;
    }
}
