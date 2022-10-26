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
/* loaded from: classes9.dex */
public final class PbLinkInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_EXT_TXT = "";
    public static final String DEFAULT_LINK_FROM = "";
    public static final String DEFAULT_PIC_URL = "";
    public static final Integer DEFAULT_SORT;
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_TO_URL = "";
    public static final Integer DEFAULT_URL_TYPE;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String ext_txt;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String link_from;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String pic_url;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer sort;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String to_url;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer url_type;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String ext_txt;
        public String link_from;
        public String pic_url;
        public Integer sort;
        public String title;
        public String to_url;
        public Integer url_type;

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
        public Builder(PbLinkInfo pbLinkInfo) {
            super(pbLinkInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {pbLinkInfo};
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
            if (pbLinkInfo == null) {
                return;
            }
            this.title = pbLinkInfo.title;
            this.to_url = pbLinkInfo.to_url;
            this.pic_url = pbLinkInfo.pic_url;
            this.link_from = pbLinkInfo.link_from;
            this.ext_txt = pbLinkInfo.ext_txt;
            this.sort = pbLinkInfo.sort;
            this.url_type = pbLinkInfo.url_type;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PbLinkInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new PbLinkInfo(this, z, null);
            }
            return (PbLinkInfo) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(498544759, "Ltbclient/PbLinkInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(498544759, "Ltbclient/PbLinkInfo;");
                return;
            }
        }
        DEFAULT_SORT = 0;
        DEFAULT_URL_TYPE = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PbLinkInfo(Builder builder, boolean z) {
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
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.to_url;
            if (str2 == null) {
                this.to_url = "";
            } else {
                this.to_url = str2;
            }
            String str3 = builder.pic_url;
            if (str3 == null) {
                this.pic_url = "";
            } else {
                this.pic_url = str3;
            }
            String str4 = builder.link_from;
            if (str4 == null) {
                this.link_from = "";
            } else {
                this.link_from = str4;
            }
            String str5 = builder.ext_txt;
            if (str5 == null) {
                this.ext_txt = "";
            } else {
                this.ext_txt = str5;
            }
            Integer num = builder.sort;
            if (num == null) {
                this.sort = DEFAULT_SORT;
            } else {
                this.sort = num;
            }
            Integer num2 = builder.url_type;
            if (num2 == null) {
                this.url_type = DEFAULT_URL_TYPE;
                return;
            } else {
                this.url_type = num2;
                return;
            }
        }
        this.title = builder.title;
        this.to_url = builder.to_url;
        this.pic_url = builder.pic_url;
        this.link_from = builder.link_from;
        this.ext_txt = builder.ext_txt;
        this.sort = builder.sort;
        this.url_type = builder.url_type;
    }

    public /* synthetic */ PbLinkInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
