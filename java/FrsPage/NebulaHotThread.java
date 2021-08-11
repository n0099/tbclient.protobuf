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
import tbclient.PbContent;
/* loaded from: classes2.dex */
public final class NebulaHotThread extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_COMMENT_NUMBER;
    public static final List<PbContent> DEFAULT_CONTENT;
    public static final String DEFAULT_GROUP_NAME = "";
    public static final Integer DEFAULT_RANK;
    public static final String DEFAULT_THREAD_ID = "";
    public static final String DEFAULT_THREAD_THUMBNAIL = "";
    public static final Integer DEFAULT_THREAD_THUMBNAIL_TYPE;
    public static final String DEFAULT_URL = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer comment_number;
    @ProtoField(label = Message.Label.REPEATED, tag = 8)
    public final List<PbContent> content;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String group_name;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer rank;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String thread_id;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String thread_thumbnail;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer thread_thumbnail_type;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String url;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<NebulaHotThread> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer comment_number;
        public List<PbContent> content;
        public String group_name;
        public Integer rank;
        public String thread_id;
        public String thread_thumbnail;
        public Integer thread_thumbnail_type;
        public String url;

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
        public Builder(NebulaHotThread nebulaHotThread) {
            super(nebulaHotThread);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {nebulaHotThread};
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
            if (nebulaHotThread == null) {
                return;
            }
            this.thread_id = nebulaHotThread.thread_id;
            this.group_name = nebulaHotThread.group_name;
            this.comment_number = nebulaHotThread.comment_number;
            this.rank = nebulaHotThread.rank;
            this.url = nebulaHotThread.url;
            this.thread_thumbnail_type = nebulaHotThread.thread_thumbnail_type;
            this.thread_thumbnail = nebulaHotThread.thread_thumbnail;
            this.content = Message.copyOf(nebulaHotThread.content);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public NebulaHotThread build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new NebulaHotThread(this, z, null) : (NebulaHotThread) invokeZ.objValue;
        }
    }

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(36338342, "Ltbclient/FrsPage/NebulaHotThread;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(36338342, "Ltbclient/FrsPage/NebulaHotThread;");
                return;
            }
        }
        DEFAULT_COMMENT_NUMBER = 0;
        DEFAULT_RANK = 0;
        DEFAULT_THREAD_THUMBNAIL_TYPE = 0;
        DEFAULT_CONTENT = Collections.emptyList();
    }

    public /* synthetic */ NebulaHotThread(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NebulaHotThread(Builder builder, boolean z) {
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
            String str = builder.thread_id;
            if (str == null) {
                this.thread_id = "";
            } else {
                this.thread_id = str;
            }
            String str2 = builder.group_name;
            if (str2 == null) {
                this.group_name = "";
            } else {
                this.group_name = str2;
            }
            Integer num = builder.comment_number;
            if (num == null) {
                this.comment_number = DEFAULT_COMMENT_NUMBER;
            } else {
                this.comment_number = num;
            }
            Integer num2 = builder.rank;
            if (num2 == null) {
                this.rank = DEFAULT_RANK;
            } else {
                this.rank = num2;
            }
            String str3 = builder.url;
            if (str3 == null) {
                this.url = "";
            } else {
                this.url = str3;
            }
            Integer num3 = builder.thread_thumbnail_type;
            if (num3 == null) {
                this.thread_thumbnail_type = DEFAULT_THREAD_THUMBNAIL_TYPE;
            } else {
                this.thread_thumbnail_type = num3;
            }
            String str4 = builder.thread_thumbnail;
            if (str4 == null) {
                this.thread_thumbnail = "";
            } else {
                this.thread_thumbnail = str4;
            }
            List<PbContent> list = builder.content;
            if (list == null) {
                this.content = DEFAULT_CONTENT;
                return;
            } else {
                this.content = Message.immutableCopyOf(list);
                return;
            }
        }
        this.thread_id = builder.thread_id;
        this.group_name = builder.group_name;
        this.comment_number = builder.comment_number;
        this.rank = builder.rank;
        this.url = builder.url;
        this.thread_thumbnail_type = builder.thread_thumbnail_type;
        this.thread_thumbnail = builder.thread_thumbnail;
        this.content = Message.immutableCopyOf(builder.content);
    }
}
