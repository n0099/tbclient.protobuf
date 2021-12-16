package tbclient.GetForumClassList;

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
/* loaded from: classes4.dex */
public final class RecommendForumClass extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_ABSTRACT = "";
    public static final Long DEFAULT_FORUM_CLASS_ID;
    public static final String DEFAULT_IMAGE_URL = "";
    public static final String DEFAULT_LINK_URL = "";
    public static final String DEFAULT_RECOMMEND_IMAGE_URL = "";
    public static final String DEFAULT_RECOMMEND_TITLE = "";
    public static final String DEFAULT_TITLE = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String _abstract;
    @ProtoField(tag = 4, type = Message.Datatype.UINT64)
    public final Long forum_class_id;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String image_url;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String link_url;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String recommend_image_url;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String recommend_title;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String title;

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<RecommendForumClass> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String _abstract;
        public Long forum_class_id;
        public String image_url;
        public String link_url;
        public String recommend_image_url;
        public String recommend_title;
        public String title;

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
        public Builder(RecommendForumClass recommendForumClass) {
            super(recommendForumClass);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {recommendForumClass};
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
            if (recommendForumClass == null) {
                return;
            }
            this.recommend_title = recommendForumClass.recommend_title;
            this.recommend_image_url = recommendForumClass.recommend_image_url;
            this.link_url = recommendForumClass.link_url;
            this.forum_class_id = recommendForumClass.forum_class_id;
            this.title = recommendForumClass.title;
            this._abstract = recommendForumClass._abstract;
            this.image_url = recommendForumClass.image_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RecommendForumClass build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new RecommendForumClass(this, z, null) : (RecommendForumClass) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1706871286, "Ltbclient/GetForumClassList/RecommendForumClass;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1706871286, "Ltbclient/GetForumClassList/RecommendForumClass;");
                return;
            }
        }
        DEFAULT_FORUM_CLASS_ID = 0L;
    }

    public /* synthetic */ RecommendForumClass(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecommendForumClass(Builder builder, boolean z) {
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
            String str = builder.recommend_title;
            if (str == null) {
                this.recommend_title = "";
            } else {
                this.recommend_title = str;
            }
            String str2 = builder.recommend_image_url;
            if (str2 == null) {
                this.recommend_image_url = "";
            } else {
                this.recommend_image_url = str2;
            }
            String str3 = builder.link_url;
            if (str3 == null) {
                this.link_url = "";
            } else {
                this.link_url = str3;
            }
            Long l = builder.forum_class_id;
            if (l == null) {
                this.forum_class_id = DEFAULT_FORUM_CLASS_ID;
            } else {
                this.forum_class_id = l;
            }
            String str4 = builder.title;
            if (str4 == null) {
                this.title = "";
            } else {
                this.title = str4;
            }
            String str5 = builder._abstract;
            if (str5 == null) {
                this._abstract = "";
            } else {
                this._abstract = str5;
            }
            String str6 = builder.image_url;
            if (str6 == null) {
                this.image_url = "";
                return;
            } else {
                this.image_url = str6;
                return;
            }
        }
        this.recommend_title = builder.recommend_title;
        this.recommend_image_url = builder.recommend_image_url;
        this.link_url = builder.link_url;
        this.forum_class_id = builder.forum_class_id;
        this.title = builder.title;
        this._abstract = builder._abstract;
        this.image_url = builder.image_url;
    }
}
