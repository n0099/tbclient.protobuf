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
/* loaded from: classes8.dex */
public final class TaskInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_BGIMG = "";
    public static final Long DEFAULT_END_TIME;
    public static final Long DEFAULT_FORUM_ID;
    public static final String DEFAULT_FORUM_NAME = "";
    public static final String DEFAULT_OBJ_ID = "";
    public static final Long DEFAULT_START_TIME;
    public static final Long DEFAULT_TASK_ID;
    public static final Long DEFAULT_THREAD_ID;
    public static final String DEFAULT_THREAD_IMG = "";
    public static final String DEFAULT_THREAD_IMG_SIZE = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String bgimg;
    @ProtoField(tag = 6, type = Message.Datatype.INT64)
    public final Long end_time;
    @ProtoField(tag = 8, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String obj_id;
    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long start_time;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long task_id;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long thread_id;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String thread_img;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String thread_img_size;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<TaskInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String bgimg;
        public Long end_time;
        public Long forum_id;
        public String forum_name;
        public String obj_id;
        public Long start_time;
        public Long task_id;
        public Long thread_id;
        public String thread_img;
        public String thread_img_size;

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
        public Builder(TaskInfo taskInfo) {
            super(taskInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {taskInfo};
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
            if (taskInfo == null) {
                return;
            }
            this.task_id = taskInfo.task_id;
            this.thread_id = taskInfo.thread_id;
            this.bgimg = taskInfo.bgimg;
            this.thread_img = taskInfo.thread_img;
            this.start_time = taskInfo.start_time;
            this.end_time = taskInfo.end_time;
            this.thread_img_size = taskInfo.thread_img_size;
            this.forum_id = taskInfo.forum_id;
            this.forum_name = taskInfo.forum_name;
            this.obj_id = taskInfo.obj_id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TaskInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new TaskInfo(this, z, null) : (TaskInfo) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(63767838, "Ltbclient/TaskInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(63767838, "Ltbclient/TaskInfo;");
                return;
            }
        }
        DEFAULT_TASK_ID = 0L;
        DEFAULT_THREAD_ID = 0L;
        DEFAULT_START_TIME = 0L;
        DEFAULT_END_TIME = 0L;
        DEFAULT_FORUM_ID = 0L;
    }

    public /* synthetic */ TaskInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskInfo(Builder builder, boolean z) {
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
            Long l = builder.task_id;
            if (l == null) {
                this.task_id = DEFAULT_TASK_ID;
            } else {
                this.task_id = l;
            }
            Long l2 = builder.thread_id;
            if (l2 == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = l2;
            }
            String str = builder.bgimg;
            if (str == null) {
                this.bgimg = "";
            } else {
                this.bgimg = str;
            }
            String str2 = builder.thread_img;
            if (str2 == null) {
                this.thread_img = "";
            } else {
                this.thread_img = str2;
            }
            Long l3 = builder.start_time;
            if (l3 == null) {
                this.start_time = DEFAULT_START_TIME;
            } else {
                this.start_time = l3;
            }
            Long l4 = builder.end_time;
            if (l4 == null) {
                this.end_time = DEFAULT_END_TIME;
            } else {
                this.end_time = l4;
            }
            String str3 = builder.thread_img_size;
            if (str3 == null) {
                this.thread_img_size = "";
            } else {
                this.thread_img_size = str3;
            }
            Long l5 = builder.forum_id;
            if (l5 == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l5;
            }
            String str4 = builder.forum_name;
            if (str4 == null) {
                this.forum_name = "";
            } else {
                this.forum_name = str4;
            }
            String str5 = builder.obj_id;
            if (str5 == null) {
                this.obj_id = "";
                return;
            } else {
                this.obj_id = str5;
                return;
            }
        }
        this.task_id = builder.task_id;
        this.thread_id = builder.thread_id;
        this.bgimg = builder.bgimg;
        this.thread_img = builder.thread_img;
        this.start_time = builder.start_time;
        this.end_time = builder.end_time;
        this.thread_img_size = builder.thread_img_size;
        this.forum_id = builder.forum_id;
        this.forum_name = builder.forum_name;
        this.obj_id = builder.obj_id;
    }
}
