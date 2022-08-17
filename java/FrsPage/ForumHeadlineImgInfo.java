package tbclient.FrsPage;

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
public final class ForumHeadlineImgInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_HEADLINE_URL = "";
    public static final String DEFAULT_IMG_URL = "";
    public static final Long DEFAULT_IMG_USER_ID;
    public static final String DEFAULT_IMG_USER_NAME = "";
    public static final Long DEFAULT_THREAD_ID;
    public static final Long DEFAULT_THREAD_USER_ID;
    public static final String DEFAULT_THREAD_USER_NAME = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String headline_url;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String img_url;
    @ProtoField(tag = 6, type = Message.Datatype.INT64)
    public final Long img_user_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String img_user_name;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long thread_id;
    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long thread_user_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String thread_user_name;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ForumHeadlineImgInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String headline_url;
        public String img_url;
        public Long img_user_id;
        public String img_user_name;
        public Long thread_id;
        public Long thread_user_id;
        public String thread_user_name;

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
        public Builder(ForumHeadlineImgInfo forumHeadlineImgInfo) {
            super(forumHeadlineImgInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {forumHeadlineImgInfo};
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
            if (forumHeadlineImgInfo == null) {
                return;
            }
            this.thread_id = forumHeadlineImgInfo.thread_id;
            this.thread_user_name = forumHeadlineImgInfo.thread_user_name;
            this.img_user_name = forumHeadlineImgInfo.img_user_name;
            this.img_url = forumHeadlineImgInfo.img_url;
            this.thread_user_id = forumHeadlineImgInfo.thread_user_id;
            this.img_user_id = forumHeadlineImgInfo.img_user_id;
            this.headline_url = forumHeadlineImgInfo.headline_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumHeadlineImgInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new ForumHeadlineImgInfo(this, z, null) : (ForumHeadlineImgInfo) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1268013380, "Ltbclient/FrsPage/ForumHeadlineImgInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1268013380, "Ltbclient/FrsPage/ForumHeadlineImgInfo;");
                return;
            }
        }
        DEFAULT_THREAD_ID = 0L;
        DEFAULT_THREAD_USER_ID = 0L;
        DEFAULT_IMG_USER_ID = 0L;
    }

    public /* synthetic */ ForumHeadlineImgInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForumHeadlineImgInfo(Builder builder, boolean z) {
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
            Long l = builder.thread_id;
            if (l == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = l;
            }
            String str = builder.thread_user_name;
            if (str == null) {
                this.thread_user_name = "";
            } else {
                this.thread_user_name = str;
            }
            String str2 = builder.img_user_name;
            if (str2 == null) {
                this.img_user_name = "";
            } else {
                this.img_user_name = str2;
            }
            String str3 = builder.img_url;
            if (str3 == null) {
                this.img_url = "";
            } else {
                this.img_url = str3;
            }
            Long l2 = builder.thread_user_id;
            if (l2 == null) {
                this.thread_user_id = DEFAULT_THREAD_USER_ID;
            } else {
                this.thread_user_id = l2;
            }
            Long l3 = builder.img_user_id;
            if (l3 == null) {
                this.img_user_id = DEFAULT_IMG_USER_ID;
            } else {
                this.img_user_id = l3;
            }
            String str4 = builder.headline_url;
            if (str4 == null) {
                this.headline_url = "";
                return;
            } else {
                this.headline_url = str4;
                return;
            }
        }
        this.thread_id = builder.thread_id;
        this.thread_user_name = builder.thread_user_name;
        this.img_user_name = builder.img_user_name;
        this.img_url = builder.img_url;
        this.thread_user_id = builder.thread_user_id;
        this.img_user_id = builder.img_user_id;
        this.headline_url = builder.headline_url;
    }
}
