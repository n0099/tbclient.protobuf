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
import java.util.Collections;
import java.util.List;
/* loaded from: classes4.dex */
public final class RecommendBook extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_BOOK_COVER = "";
    public static final String DEFAULT_BOOK_ID = "";
    public static final List<String> DEFAULT_BOOK_TIPS;
    public static final String DEFAULT_BOOK_TITLE = "";
    public static final Integer DEFAULT_BOOK_TYPE;
    public static final String DEFAULT_BOTTON_TEXT = "";
    public static final String DEFAULT_RECOMMEND_TEXT = "";
    public static final String DEFAULT_SUBSCRIPT_ICON = "";
    public static final String DEFAULT_SUGGEST_TEXT = "";
    public static final String DEFAULT_SUGGEST_URL = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String book_cover;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String book_id;
    @ProtoField(label = Message.Label.REPEATED, tag = 8, type = Message.Datatype.STRING)
    public final List<String> book_tips;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String book_title;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer book_type;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String botton_text;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String recommend_text;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String subscript_icon;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String suggest_text;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String suggest_url;

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<RecommendBook> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String book_cover;
        public String book_id;
        public List<String> book_tips;
        public String book_title;
        public Integer book_type;
        public String botton_text;
        public String recommend_text;
        public String subscript_icon;
        public String suggest_text;
        public String suggest_url;

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
        public Builder(RecommendBook recommendBook) {
            super(recommendBook);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {recommendBook};
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
            if (recommendBook == null) {
                return;
            }
            this.recommend_text = recommendBook.recommend_text;
            this.suggest_text = recommendBook.suggest_text;
            this.suggest_url = recommendBook.suggest_url;
            this.book_id = recommendBook.book_id;
            this.book_type = recommendBook.book_type;
            this.book_cover = recommendBook.book_cover;
            this.book_title = recommendBook.book_title;
            this.book_tips = Message.copyOf(recommendBook.book_tips);
            this.botton_text = recommendBook.botton_text;
            this.subscript_icon = recommendBook.subscript_icon;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RecommendBook build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new RecommendBook(this, z, null) : (RecommendBook) invokeZ.objValue;
        }
    }

    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-108097350, "Ltbclient/PbPage/RecommendBook;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-108097350, "Ltbclient/PbPage/RecommendBook;");
                return;
            }
        }
        DEFAULT_BOOK_TYPE = 0;
        DEFAULT_BOOK_TIPS = Collections.emptyList();
    }

    public /* synthetic */ RecommendBook(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecommendBook(Builder builder, boolean z) {
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
            String str = builder.recommend_text;
            if (str == null) {
                this.recommend_text = "";
            } else {
                this.recommend_text = str;
            }
            String str2 = builder.suggest_text;
            if (str2 == null) {
                this.suggest_text = "";
            } else {
                this.suggest_text = str2;
            }
            String str3 = builder.suggest_url;
            if (str3 == null) {
                this.suggest_url = "";
            } else {
                this.suggest_url = str3;
            }
            String str4 = builder.book_id;
            if (str4 == null) {
                this.book_id = "";
            } else {
                this.book_id = str4;
            }
            Integer num = builder.book_type;
            if (num == null) {
                this.book_type = DEFAULT_BOOK_TYPE;
            } else {
                this.book_type = num;
            }
            String str5 = builder.book_cover;
            if (str5 == null) {
                this.book_cover = "";
            } else {
                this.book_cover = str5;
            }
            String str6 = builder.book_title;
            if (str6 == null) {
                this.book_title = "";
            } else {
                this.book_title = str6;
            }
            List<String> list = builder.book_tips;
            if (list == null) {
                this.book_tips = DEFAULT_BOOK_TIPS;
            } else {
                this.book_tips = Message.immutableCopyOf(list);
            }
            String str7 = builder.botton_text;
            if (str7 == null) {
                this.botton_text = "";
            } else {
                this.botton_text = str7;
            }
            String str8 = builder.subscript_icon;
            if (str8 == null) {
                this.subscript_icon = "";
                return;
            } else {
                this.subscript_icon = str8;
                return;
            }
        }
        this.recommend_text = builder.recommend_text;
        this.suggest_text = builder.suggest_text;
        this.suggest_url = builder.suggest_url;
        this.book_id = builder.book_id;
        this.book_type = builder.book_type;
        this.book_cover = builder.book_cover;
        this.book_title = builder.book_title;
        this.book_tips = Message.immutableCopyOf(builder.book_tips);
        this.botton_text = builder.botton_text;
        this.subscript_icon = builder.subscript_icon;
    }
}
