package tbclient.ExcPbPage;

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
public final class ExcContent extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_ALIGN;
    public static final String DEFAULT_BIG_CDN_SRC = "";
    public static final String DEFAULT_BIG_SIZE = "";
    public static final String DEFAULT_BIG_SRC = "";
    public static final String DEFAULT_BSIZE = "";
    public static final String DEFAULT_C = "";
    public static final String DEFAULT_CDN_SRC = "";
    public static final String DEFAULT_COLOR = "";
    public static final String DEFAULT_LINK = "";
    public static final Integer DEFAULT_SIZE;
    public static final String DEFAULT_SRC = "";
    public static final String DEFAULT_TEXT = "";
    public static final Long DEFAULT_TYPE;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer align;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String big_cdn_src;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String big_size;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String big_src;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String bsize;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String c;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String cdn_src;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String color;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String link;
    @ProtoField(tag = 13, type = Message.Datatype.INT32)
    public final Integer size;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String src;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String text;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long type;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ExcContent> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer align;
        public String big_cdn_src;
        public String big_size;
        public String big_src;
        public String bsize;
        public String c;
        public String cdn_src;
        public String color;
        public String link;
        public Integer size;
        public String src;
        public String text;
        public Long type;

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
        public Builder(ExcContent excContent) {
            super(excContent);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {excContent};
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
            if (excContent == null) {
                return;
            }
            this.type = excContent.type;
            this.text = excContent.text;
            this.link = excContent.link;
            this.src = excContent.src;
            this.bsize = excContent.bsize;
            this.big_src = excContent.big_src;
            this.big_size = excContent.big_size;
            this.cdn_src = excContent.cdn_src;
            this.big_cdn_src = excContent.big_cdn_src;
            this.c = excContent.c;
            this.align = excContent.align;
            this.color = excContent.color;
            this.size = excContent.size;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ExcContent build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new ExcContent(this, z, null) : (ExcContent) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1068970230, "Ltbclient/ExcPbPage/ExcContent;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1068970230, "Ltbclient/ExcPbPage/ExcContent;");
                return;
            }
        }
        DEFAULT_TYPE = 0L;
        DEFAULT_ALIGN = 0;
        DEFAULT_SIZE = 0;
    }

    public /* synthetic */ ExcContent(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExcContent(Builder builder, boolean z) {
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
            Long l = builder.type;
            if (l == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = l;
            }
            String str = builder.text;
            if (str == null) {
                this.text = "";
            } else {
                this.text = str;
            }
            String str2 = builder.link;
            if (str2 == null) {
                this.link = "";
            } else {
                this.link = str2;
            }
            String str3 = builder.src;
            if (str3 == null) {
                this.src = "";
            } else {
                this.src = str3;
            }
            String str4 = builder.bsize;
            if (str4 == null) {
                this.bsize = "";
            } else {
                this.bsize = str4;
            }
            String str5 = builder.big_src;
            if (str5 == null) {
                this.big_src = "";
            } else {
                this.big_src = str5;
            }
            String str6 = builder.big_size;
            if (str6 == null) {
                this.big_size = "";
            } else {
                this.big_size = str6;
            }
            String str7 = builder.cdn_src;
            if (str7 == null) {
                this.cdn_src = "";
            } else {
                this.cdn_src = str7;
            }
            String str8 = builder.big_cdn_src;
            if (str8 == null) {
                this.big_cdn_src = "";
            } else {
                this.big_cdn_src = str8;
            }
            String str9 = builder.c;
            if (str9 == null) {
                this.c = "";
            } else {
                this.c = str9;
            }
            Integer num = builder.align;
            if (num == null) {
                this.align = DEFAULT_ALIGN;
            } else {
                this.align = num;
            }
            String str10 = builder.color;
            if (str10 == null) {
                this.color = "";
            } else {
                this.color = str10;
            }
            Integer num2 = builder.size;
            if (num2 == null) {
                this.size = DEFAULT_SIZE;
                return;
            } else {
                this.size = num2;
                return;
            }
        }
        this.type = builder.type;
        this.text = builder.text;
        this.link = builder.link;
        this.src = builder.src;
        this.bsize = builder.bsize;
        this.big_src = builder.big_src;
        this.big_size = builder.big_size;
        this.cdn_src = builder.cdn_src;
        this.big_cdn_src = builder.big_cdn_src;
        this.c = builder.c;
        this.align = builder.align;
        this.color = builder.color;
        this.size = builder.size;
    }
}
