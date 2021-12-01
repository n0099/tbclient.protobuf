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
/* loaded from: classes4.dex */
public final class VideoTemplateContent extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_CONTENT = "";
    public static final Long DEFAULT_END_TIME;
    public static final Integer DEFAULT_PIC_HEIGHT;
    public static final Integer DEFAULT_PIC_WIDTH;
    public static final Double DEFAULT_POSITION_TYPE;
    public static final Double DEFAULT_POSITION_X;
    public static final Double DEFAULT_POSITION_Y;
    public static final Long DEFAULT_START_TIME;
    public static final String DEFAULT_TEXT_COLOR = "";
    public static final Double DEFAULT_TEXT_SIZE;
    public static final Integer DEFAULT_TYPE;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String content;
    @ProtoField(tag = 6, type = Message.Datatype.INT64)
    public final Long end_time;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer pic_height;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer pic_width;
    @ProtoField(tag = 9, type = Message.Datatype.DOUBLE)
    public final Double position_type;
    @ProtoField(tag = 7, type = Message.Datatype.DOUBLE)
    public final Double position_x;
    @ProtoField(tag = 8, type = Message.Datatype.DOUBLE)
    public final Double position_y;
    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long start_time;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String text_color;
    @ProtoField(tag = 10, type = Message.Datatype.DOUBLE)
    public final Double text_size;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer type;

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<VideoTemplateContent> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String content;
        public Long end_time;
        public Integer pic_height;
        public Integer pic_width;
        public Double position_type;
        public Double position_x;
        public Double position_y;
        public Long start_time;
        public String text_color;
        public Double text_size;
        public Integer type;

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
        public Builder(VideoTemplateContent videoTemplateContent) {
            super(videoTemplateContent);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {videoTemplateContent};
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
            if (videoTemplateContent == null) {
                return;
            }
            this.content = videoTemplateContent.content;
            this.type = videoTemplateContent.type;
            this.pic_width = videoTemplateContent.pic_width;
            this.pic_height = videoTemplateContent.pic_height;
            this.start_time = videoTemplateContent.start_time;
            this.end_time = videoTemplateContent.end_time;
            this.position_x = videoTemplateContent.position_x;
            this.position_y = videoTemplateContent.position_y;
            this.position_type = videoTemplateContent.position_type;
            this.text_size = videoTemplateContent.text_size;
            this.text_color = videoTemplateContent.text_color;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VideoTemplateContent build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new VideoTemplateContent(this, z, null) : (VideoTemplateContent) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-126094995, "Ltbclient/VideoTemplateContent;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-126094995, "Ltbclient/VideoTemplateContent;");
                return;
            }
        }
        DEFAULT_TYPE = 0;
        DEFAULT_PIC_WIDTH = 0;
        DEFAULT_PIC_HEIGHT = 0;
        DEFAULT_START_TIME = 0L;
        DEFAULT_END_TIME = 0L;
        Double valueOf = Double.valueOf(0.0d);
        DEFAULT_POSITION_X = valueOf;
        DEFAULT_POSITION_Y = valueOf;
        DEFAULT_POSITION_TYPE = valueOf;
        DEFAULT_TEXT_SIZE = valueOf;
    }

    public /* synthetic */ VideoTemplateContent(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoTemplateContent(Builder builder, boolean z) {
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
            String str = builder.content;
            if (str == null) {
                this.content = "";
            } else {
                this.content = str;
            }
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            Integer num2 = builder.pic_width;
            if (num2 == null) {
                this.pic_width = DEFAULT_PIC_WIDTH;
            } else {
                this.pic_width = num2;
            }
            Integer num3 = builder.pic_height;
            if (num3 == null) {
                this.pic_height = DEFAULT_PIC_HEIGHT;
            } else {
                this.pic_height = num3;
            }
            Long l = builder.start_time;
            if (l == null) {
                this.start_time = DEFAULT_START_TIME;
            } else {
                this.start_time = l;
            }
            Long l2 = builder.end_time;
            if (l2 == null) {
                this.end_time = DEFAULT_END_TIME;
            } else {
                this.end_time = l2;
            }
            Double d2 = builder.position_x;
            if (d2 == null) {
                this.position_x = DEFAULT_POSITION_X;
            } else {
                this.position_x = d2;
            }
            Double d3 = builder.position_y;
            if (d3 == null) {
                this.position_y = DEFAULT_POSITION_Y;
            } else {
                this.position_y = d3;
            }
            Double d4 = builder.position_type;
            if (d4 == null) {
                this.position_type = DEFAULT_POSITION_TYPE;
            } else {
                this.position_type = d4;
            }
            Double d5 = builder.text_size;
            if (d5 == null) {
                this.text_size = DEFAULT_TEXT_SIZE;
            } else {
                this.text_size = d5;
            }
            String str2 = builder.text_color;
            if (str2 == null) {
                this.text_color = "";
                return;
            } else {
                this.text_color = str2;
                return;
            }
        }
        this.content = builder.content;
        this.type = builder.type;
        this.pic_width = builder.pic_width;
        this.pic_height = builder.pic_height;
        this.start_time = builder.start_time;
        this.end_time = builder.end_time;
        this.position_x = builder.position_x;
        this.position_y = builder.position_y;
        this.position_type = builder.position_type;
        this.text_size = builder.text_size;
        this.text_color = builder.text_color;
    }
}
