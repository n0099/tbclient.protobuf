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
/* loaded from: classes5.dex */
public final class ForumHeadlineImgInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_IMG_URL = "";
    public static final Long DEFAULT_IMG_USER_ID;
    public static final String DEFAULT_IMG_USER_NAME = "";
    public static final Integer DEFAULT_RANK_NUM;
    public static final String DEFAULT_RANK_UP_INFO = "";
    public static final String DEFAULT_RANK_URL = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String img_url;
    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long img_user_id;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String img_user_name;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer rank_num;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String rank_up_info;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String rank_url;

    /* loaded from: classes5.dex */
    public static final class Builder extends Message.Builder<ForumHeadlineImgInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String img_url;
        public Long img_user_id;
        public String img_user_name;
        public Integer rank_num;
        public String rank_up_info;
        public String rank_url;

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
        public Builder(ForumHeadlineImgInfo forumHeadlineImgInfo) {
            super(forumHeadlineImgInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {forumHeadlineImgInfo};
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
            if (forumHeadlineImgInfo == null) {
                return;
            }
            this.img_user_name = forumHeadlineImgInfo.img_user_name;
            this.img_url = forumHeadlineImgInfo.img_url;
            this.rank_num = forumHeadlineImgInfo.rank_num;
            this.img_user_id = forumHeadlineImgInfo.img_user_id;
            this.rank_url = forumHeadlineImgInfo.rank_url;
            this.rank_up_info = forumHeadlineImgInfo.rank_up_info;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumHeadlineImgInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new ForumHeadlineImgInfo(this, z, null) : (ForumHeadlineImgInfo) invokeZ.objValue;
        }
    }

    /* loaded from: classes5.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(955752027, "Ltbclient/PbPage/ForumHeadlineImgInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(955752027, "Ltbclient/PbPage/ForumHeadlineImgInfo;");
                return;
            }
        }
        DEFAULT_RANK_NUM = 0;
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
            String str = builder.img_user_name;
            if (str == null) {
                this.img_user_name = "";
            } else {
                this.img_user_name = str;
            }
            String str2 = builder.img_url;
            if (str2 == null) {
                this.img_url = "";
            } else {
                this.img_url = str2;
            }
            Integer num = builder.rank_num;
            if (num == null) {
                this.rank_num = DEFAULT_RANK_NUM;
            } else {
                this.rank_num = num;
            }
            Long l = builder.img_user_id;
            if (l == null) {
                this.img_user_id = DEFAULT_IMG_USER_ID;
            } else {
                this.img_user_id = l;
            }
            String str3 = builder.rank_url;
            if (str3 == null) {
                this.rank_url = "";
            } else {
                this.rank_url = str3;
            }
            String str4 = builder.rank_up_info;
            if (str4 == null) {
                this.rank_up_info = "";
                return;
            } else {
                this.rank_up_info = str4;
                return;
            }
        }
        this.img_user_name = builder.img_user_name;
        this.img_url = builder.img_url;
        this.rank_num = builder.rank_num;
        this.img_user_id = builder.img_user_id;
        this.rank_url = builder.rank_url;
        this.rank_up_info = builder.rank_up_info;
    }
}
