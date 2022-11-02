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
/* loaded from: classes9.dex */
public final class NewsInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_BUTTON_TEXT = "";
    public static final String DEFAULT_NEWS_ICON = "";
    public static final String DEFAULT_NEWS_LINK = "";
    public static final Integer DEFAULT_NEWS_TYPE;
    public static final Integer DEFAULT_POSITION;
    public static final String DEFAULT_SUBTITLE = "";
    public static final String DEFAULT_SUMMARY = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String button_text;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String news_icon;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String news_link;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer news_type;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer position;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String subtitle;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String summary;

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<NewsInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String button_text;
        public String news_icon;
        public String news_link;
        public Integer news_type;
        public Integer position;
        public String subtitle;
        public String summary;

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
        public Builder(NewsInfo newsInfo) {
            super(newsInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {newsInfo};
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
            if (newsInfo == null) {
                return;
            }
            this.news_link = newsInfo.news_link;
            this.summary = newsInfo.summary;
            this.position = newsInfo.position;
            this.news_type = newsInfo.news_type;
            this.news_icon = newsInfo.news_icon;
            this.subtitle = newsInfo.subtitle;
            this.button_text = newsInfo.button_text;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public NewsInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new NewsInfo(this, z, null);
            }
            return (NewsInfo) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(999535126, "Ltbclient/PbPage/NewsInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(999535126, "Ltbclient/PbPage/NewsInfo;");
                return;
            }
        }
        DEFAULT_POSITION = 0;
        DEFAULT_NEWS_TYPE = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewsInfo(Builder builder, boolean z) {
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
            String str = builder.news_link;
            if (str == null) {
                this.news_link = "";
            } else {
                this.news_link = str;
            }
            String str2 = builder.summary;
            if (str2 == null) {
                this.summary = "";
            } else {
                this.summary = str2;
            }
            Integer num = builder.position;
            if (num == null) {
                this.position = DEFAULT_POSITION;
            } else {
                this.position = num;
            }
            Integer num2 = builder.news_type;
            if (num2 == null) {
                this.news_type = DEFAULT_NEWS_TYPE;
            } else {
                this.news_type = num2;
            }
            String str3 = builder.news_icon;
            if (str3 == null) {
                this.news_icon = "";
            } else {
                this.news_icon = str3;
            }
            String str4 = builder.subtitle;
            if (str4 == null) {
                this.subtitle = "";
            } else {
                this.subtitle = str4;
            }
            String str5 = builder.button_text;
            if (str5 == null) {
                this.button_text = "";
                return;
            } else {
                this.button_text = str5;
                return;
            }
        }
        this.news_link = builder.news_link;
        this.summary = builder.summary;
        this.position = builder.position;
        this.news_type = builder.news_type;
        this.news_icon = builder.news_icon;
        this.subtitle = builder.subtitle;
        this.button_text = builder.button_text;
    }

    public /* synthetic */ NewsInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
