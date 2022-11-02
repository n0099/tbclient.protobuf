package tbclient.GetInterview;

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
import tbclient.PbContent;
import tbclient.User;
/* loaded from: classes9.dex */
public final class InterviewInfo extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final List<PbContent> DEFAULT_CONTENT;
    public static final Long DEFAULT_CREATE_TIME;
    public static final Long DEFAULT_MAIN_PID;
    public static final Long DEFAULT_POST_ID;
    public static final Integer DEFAULT_TYPE;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 5)
    public final User author;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<PbContent> content;
    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long create_time;
    @ProtoField(tag = 7, type = Message.Datatype.INT64)
    public final Long main_pid;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long post_id;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer type;

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<InterviewInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public User author;
        public List<PbContent> content;
        public Long create_time;
        public Long main_pid;
        public Long post_id;
        public Integer type;

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
        public Builder(InterviewInfo interviewInfo) {
            super(interviewInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {interviewInfo};
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
            if (interviewInfo == null) {
                return;
            }
            this.post_id = interviewInfo.post_id;
            this.content = Message.copyOf(interviewInfo.content);
            this.create_time = interviewInfo.create_time;
            this.author = interviewInfo.author;
            this.type = interviewInfo.type;
            this.main_pid = interviewInfo.main_pid;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public InterviewInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new InterviewInfo(this, z, null);
            }
            return (InterviewInfo) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1769838854, "Ltbclient/GetInterview/InterviewInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1769838854, "Ltbclient/GetInterview/InterviewInfo;");
                return;
            }
        }
        DEFAULT_POST_ID = 0L;
        DEFAULT_CONTENT = Collections.emptyList();
        DEFAULT_CREATE_TIME = 0L;
        DEFAULT_TYPE = 0;
        DEFAULT_MAIN_PID = 0L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterviewInfo(Builder builder, boolean z) {
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
            Long l = builder.post_id;
            if (l == null) {
                this.post_id = DEFAULT_POST_ID;
            } else {
                this.post_id = l;
            }
            List<PbContent> list = builder.content;
            if (list == null) {
                this.content = DEFAULT_CONTENT;
            } else {
                this.content = Message.immutableCopyOf(list);
            }
            Long l2 = builder.create_time;
            if (l2 == null) {
                this.create_time = DEFAULT_CREATE_TIME;
            } else {
                this.create_time = l2;
            }
            this.author = builder.author;
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            Long l3 = builder.main_pid;
            if (l3 == null) {
                this.main_pid = DEFAULT_MAIN_PID;
                return;
            } else {
                this.main_pid = l3;
                return;
            }
        }
        this.post_id = builder.post_id;
        this.content = Message.immutableCopyOf(builder.content);
        this.create_time = builder.create_time;
        this.author = builder.author;
        this.type = builder.type;
        this.main_pid = builder.main_pid;
    }

    public /* synthetic */ InterviewInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
