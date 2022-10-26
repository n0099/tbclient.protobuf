package tbclient.VideoTemplate;

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
import tbclient.VideoTemplateContent;
/* loaded from: classes9.dex */
public final class DataRes extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_ACTIVITY_URL = "";
    public static final String DEFAULT_BACK_URL = "";
    public static final Integer DEFAULT_TOPIC_ID;
    public static final String DEFAULT_TOPIC_NAME = "";
    public static final List<VideoTemplateContent> DEFAULT_VIDEO_TEMPLATE_CONTENT;
    public static final String DEFAULT_VIDEO_TEMPLATE_URL = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String activity_url;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String back_url;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer topic_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String topic_name;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<VideoTemplateContent> video_template_content;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String video_template_url;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String activity_url;
        public String back_url;
        public Integer topic_id;
        public String topic_name;
        public List video_template_content;
        public String video_template_url;

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
        public Builder(DataRes dataRes) {
            super(dataRes);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {dataRes};
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
            if (dataRes == null) {
                return;
            }
            this.video_template_content = Message.copyOf(dataRes.video_template_content);
            this.topic_id = dataRes.topic_id;
            this.topic_name = dataRes.topic_name;
            this.back_url = dataRes.back_url;
            this.video_template_url = dataRes.video_template_url;
            this.activity_url = dataRes.activity_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new DataRes(this, z, null);
            }
            return (DataRes) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1591786153, "Ltbclient/VideoTemplate/DataRes;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1591786153, "Ltbclient/VideoTemplate/DataRes;");
                return;
            }
        }
        DEFAULT_VIDEO_TEMPLATE_CONTENT = Collections.emptyList();
        DEFAULT_TOPIC_ID = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataRes(Builder builder, boolean z) {
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
            List list = builder.video_template_content;
            if (list == null) {
                this.video_template_content = DEFAULT_VIDEO_TEMPLATE_CONTENT;
            } else {
                this.video_template_content = Message.immutableCopyOf(list);
            }
            Integer num = builder.topic_id;
            if (num == null) {
                this.topic_id = DEFAULT_TOPIC_ID;
            } else {
                this.topic_id = num;
            }
            String str = builder.topic_name;
            if (str == null) {
                this.topic_name = "";
            } else {
                this.topic_name = str;
            }
            String str2 = builder.back_url;
            if (str2 == null) {
                this.back_url = "";
            } else {
                this.back_url = str2;
            }
            String str3 = builder.video_template_url;
            if (str3 == null) {
                this.video_template_url = "";
            } else {
                this.video_template_url = str3;
            }
            String str4 = builder.activity_url;
            if (str4 == null) {
                this.activity_url = "";
                return;
            } else {
                this.activity_url = str4;
                return;
            }
        }
        this.video_template_content = Message.immutableCopyOf(builder.video_template_content);
        this.topic_id = builder.topic_id;
        this.topic_name = builder.topic_name;
        this.back_url = builder.back_url;
        this.video_template_url = builder.video_template_url;
        this.activity_url = builder.activity_url;
    }

    public /* synthetic */ DataRes(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
