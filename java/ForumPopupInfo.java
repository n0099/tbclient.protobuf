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
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class ForumPopupInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_FORUM_ID;
    public static final String DEFAULT_FORUM_NAME = "";
    public static final List<String> DEFAULT_FORUM_NAMES;
    public static final Integer DEFAULT_MEM_COUNT_STATIC;
    public static final Integer DEFAULT_THREAD_COUNT_STATIC;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer forum_id;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(label = Message.Label.REPEATED, tag = 4, type = Message.Datatype.STRING)
    public final List<String> forum_names;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer mem_count_static;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer thread_count_static;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ForumPopupInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer forum_id;
        public String forum_name;
        public List<String> forum_names;
        public Integer mem_count_static;
        public Integer thread_count_static;

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
        public Builder(ForumPopupInfo forumPopupInfo) {
            super(forumPopupInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {forumPopupInfo};
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
            if (forumPopupInfo == null) {
                return;
            }
            this.forum_id = forumPopupInfo.forum_id;
            this.mem_count_static = forumPopupInfo.mem_count_static;
            this.thread_count_static = forumPopupInfo.thread_count_static;
            this.forum_names = Message.copyOf(forumPopupInfo.forum_names);
            this.forum_name = forumPopupInfo.forum_name;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumPopupInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new ForumPopupInfo(this, z, null) : (ForumPopupInfo) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1679181272, "Ltbclient/ForumPopupInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1679181272, "Ltbclient/ForumPopupInfo;");
                return;
            }
        }
        DEFAULT_FORUM_ID = 0;
        DEFAULT_MEM_COUNT_STATIC = 0;
        DEFAULT_THREAD_COUNT_STATIC = 0;
        DEFAULT_FORUM_NAMES = Collections.emptyList();
    }

    public /* synthetic */ ForumPopupInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForumPopupInfo(Builder builder, boolean z) {
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
            Integer num = builder.forum_id;
            if (num == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = num;
            }
            Integer num2 = builder.mem_count_static;
            if (num2 == null) {
                this.mem_count_static = DEFAULT_MEM_COUNT_STATIC;
            } else {
                this.mem_count_static = num2;
            }
            Integer num3 = builder.thread_count_static;
            if (num3 == null) {
                this.thread_count_static = DEFAULT_THREAD_COUNT_STATIC;
            } else {
                this.thread_count_static = num3;
            }
            List<String> list = builder.forum_names;
            if (list == null) {
                this.forum_names = DEFAULT_FORUM_NAMES;
            } else {
                this.forum_names = Message.immutableCopyOf(list);
            }
            String str = builder.forum_name;
            if (str == null) {
                this.forum_name = "";
                return;
            } else {
                this.forum_name = str;
                return;
            }
        }
        this.forum_id = builder.forum_id;
        this.mem_count_static = builder.mem_count_static;
        this.thread_count_static = builder.thread_count_static;
        this.forum_names = Message.immutableCopyOf(builder.forum_names);
        this.forum_name = builder.forum_name;
    }
}
