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
import java.util.Collections;
import java.util.List;
/* loaded from: classes8.dex */
public final class RecomUserInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final List<CommonForum> DEFAULT_COMMON_FORUM;
    public static final String DEFAULT_MESSAGE = "";
    public static final List<PostInfo> DEFAULT_POST_INFO;
    public static final String DEFAULT_POS_NAME = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<CommonForum> common_forum;
    @ProtoField(tag = 6)
    public final CommonDistance distanceinfo;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String message;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String pos_name;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<PostInfo> post_info;
    @ProtoField(tag = 1)
    public final UserInfo user_info;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<RecomUserInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public List<CommonForum> common_forum;
        public CommonDistance distanceinfo;
        public String message;
        public String pos_name;
        public List<PostInfo> post_info;
        public UserInfo user_info;

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
        public Builder(RecomUserInfo recomUserInfo) {
            super(recomUserInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {recomUserInfo};
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
            if (recomUserInfo == null) {
                return;
            }
            this.user_info = recomUserInfo.user_info;
            this.common_forum = Message.copyOf(recomUserInfo.common_forum);
            this.post_info = Message.copyOf(recomUserInfo.post_info);
            this.pos_name = recomUserInfo.pos_name;
            this.message = recomUserInfo.message;
            this.distanceinfo = recomUserInfo.distanceinfo;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RecomUserInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new RecomUserInfo(this, z, null) : (RecomUserInfo) invokeZ.objValue;
        }
    }

    /* loaded from: classes8.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1139974615, "Ltbclient/FrsPage/RecomUserInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1139974615, "Ltbclient/FrsPage/RecomUserInfo;");
                return;
            }
        }
        DEFAULT_COMMON_FORUM = Collections.emptyList();
        DEFAULT_POST_INFO = Collections.emptyList();
    }

    public /* synthetic */ RecomUserInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecomUserInfo(Builder builder, boolean z) {
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
            this.user_info = builder.user_info;
            List<CommonForum> list = builder.common_forum;
            if (list == null) {
                this.common_forum = DEFAULT_COMMON_FORUM;
            } else {
                this.common_forum = Message.immutableCopyOf(list);
            }
            List<PostInfo> list2 = builder.post_info;
            if (list2 == null) {
                this.post_info = DEFAULT_POST_INFO;
            } else {
                this.post_info = Message.immutableCopyOf(list2);
            }
            String str = builder.pos_name;
            if (str == null) {
                this.pos_name = "";
            } else {
                this.pos_name = str;
            }
            String str2 = builder.message;
            if (str2 == null) {
                this.message = "";
            } else {
                this.message = str2;
            }
            this.distanceinfo = builder.distanceinfo;
            return;
        }
        this.user_info = builder.user_info;
        this.common_forum = Message.immutableCopyOf(builder.common_forum);
        this.post_info = Message.immutableCopyOf(builder.post_info);
        this.pos_name = builder.pos_name;
        this.message = builder.message;
        this.distanceinfo = builder.distanceinfo;
    }
}
