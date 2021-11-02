package tbclient.UrlParser;

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
public final class DataRes extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_DESCRIPTION = "";
    public static final String DEFAULT_IMAGE = "";
    public static final Integer DEFAULT_IS_RECOGNIZE;
    public static final String DEFAULT_LINK_FROM = "";
    public static final String DEFAULT_PRICE_TXT = "";
    public static final Integer DEFAULT_STATUS;
    public static final String DEFAULT_TITLE = "";
    public static final Integer DEFAULT_URL_TYPE;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String description;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String image;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer is_recognize;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String link_from;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String price_txt;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer status;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer url_type;

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String description;
        public String image;
        public Integer is_recognize;
        public String link_from;
        public String price_txt;
        public Integer status;
        public String title;
        public Integer url_type;

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
        public Builder(DataRes dataRes) {
            super(dataRes);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {dataRes};
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
            if (dataRes == null) {
                return;
            }
            this.url_type = dataRes.url_type;
            this.status = dataRes.status;
            this.image = dataRes.image;
            this.link_from = dataRes.link_from;
            this.title = dataRes.title;
            this.price_txt = dataRes.price_txt;
            this.is_recognize = dataRes.is_recognize;
            this.description = dataRes.description;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new DataRes(this, z, null) : (DataRes) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(438144880, "Ltbclient/UrlParser/DataRes;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(438144880, "Ltbclient/UrlParser/DataRes;");
                return;
            }
        }
        DEFAULT_URL_TYPE = 0;
        DEFAULT_STATUS = 0;
        DEFAULT_IS_RECOGNIZE = 0;
    }

    public /* synthetic */ DataRes(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataRes(Builder builder, boolean z) {
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
            Integer num = builder.url_type;
            if (num == null) {
                this.url_type = DEFAULT_URL_TYPE;
            } else {
                this.url_type = num;
            }
            Integer num2 = builder.status;
            if (num2 == null) {
                this.status = DEFAULT_STATUS;
            } else {
                this.status = num2;
            }
            String str = builder.image;
            if (str == null) {
                this.image = "";
            } else {
                this.image = str;
            }
            String str2 = builder.link_from;
            if (str2 == null) {
                this.link_from = "";
            } else {
                this.link_from = str2;
            }
            String str3 = builder.title;
            if (str3 == null) {
                this.title = "";
            } else {
                this.title = str3;
            }
            String str4 = builder.price_txt;
            if (str4 == null) {
                this.price_txt = "";
            } else {
                this.price_txt = str4;
            }
            Integer num3 = builder.is_recognize;
            if (num3 == null) {
                this.is_recognize = DEFAULT_IS_RECOGNIZE;
            } else {
                this.is_recognize = num3;
            }
            String str5 = builder.description;
            if (str5 == null) {
                this.description = "";
                return;
            } else {
                this.description = str5;
                return;
            }
        }
        this.url_type = builder.url_type;
        this.status = builder.status;
        this.image = builder.image;
        this.link_from = builder.link_from;
        this.title = builder.title;
        this.price_txt = builder.price_txt;
        this.is_recognize = builder.is_recognize;
        this.description = builder.description;
    }
}
