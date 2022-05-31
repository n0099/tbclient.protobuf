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
/* loaded from: classes8.dex */
public final class VideoActive extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_ACTIVE_NAME = "";
    public static final String DEFAULT_ACTIVE_URL = "";
    public static final String DEFAULT_BANNER_URL = "";
    public static final String DEFAULT_DESCRIPTION = "";
    public static final Integer DEFAULT_ID;
    public static final String DEFAULT_NATIVE_URL = "";
    public static final String DEFAULT_REMARK = "";
    public static final List<ThreadInfo> DEFAULT_THREAD_LIST;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String active_name;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String active_url;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String banner_url;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String description;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer id;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String native_url;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String remark;
    @ProtoField(label = Message.Label.REPEATED, tag = 8)
    public final List<ThreadInfo> thread_list;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<VideoActive> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String active_name;
        public String active_url;
        public String banner_url;
        public String description;
        public Integer id;
        public String native_url;
        public String remark;
        public List<ThreadInfo> thread_list;

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
        public Builder(VideoActive videoActive) {
            super(videoActive);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {videoActive};
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
            if (videoActive == null) {
                return;
            }
            this.id = videoActive.id;
            this.active_name = videoActive.active_name;
            this.active_url = videoActive.active_url;
            this.native_url = videoActive.native_url;
            this.description = videoActive.description;
            this.banner_url = videoActive.banner_url;
            this.remark = videoActive.remark;
            this.thread_list = Message.copyOf(videoActive.thread_list);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VideoActive build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new VideoActive(this, z, null) : (VideoActive) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1446641380, "Ltbclient/VideoActive;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1446641380, "Ltbclient/VideoActive;");
                return;
            }
        }
        DEFAULT_ID = 0;
        DEFAULT_THREAD_LIST = Collections.emptyList();
    }

    public /* synthetic */ VideoActive(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoActive(Builder builder, boolean z) {
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
            Integer num = builder.id;
            if (num == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = num;
            }
            String str = builder.active_name;
            if (str == null) {
                this.active_name = "";
            } else {
                this.active_name = str;
            }
            String str2 = builder.active_url;
            if (str2 == null) {
                this.active_url = "";
            } else {
                this.active_url = str2;
            }
            String str3 = builder.native_url;
            if (str3 == null) {
                this.native_url = "";
            } else {
                this.native_url = str3;
            }
            String str4 = builder.description;
            if (str4 == null) {
                this.description = "";
            } else {
                this.description = str4;
            }
            String str5 = builder.banner_url;
            if (str5 == null) {
                this.banner_url = "";
            } else {
                this.banner_url = str5;
            }
            String str6 = builder.remark;
            if (str6 == null) {
                this.remark = "";
            } else {
                this.remark = str6;
            }
            List<ThreadInfo> list = builder.thread_list;
            if (list == null) {
                this.thread_list = DEFAULT_THREAD_LIST;
                return;
            } else {
                this.thread_list = Message.immutableCopyOf(list);
                return;
            }
        }
        this.id = builder.id;
        this.active_name = builder.active_name;
        this.active_url = builder.active_url;
        this.native_url = builder.native_url;
        this.description = builder.description;
        this.banner_url = builder.banner_url;
        this.remark = builder.remark;
        this.thread_list = Message.immutableCopyOf(builder.thread_list);
    }
}
