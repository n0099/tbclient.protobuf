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
public final class TPointPost extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final List<ActBtn> DEFAULT_ACT_BTN;
    public static final Integer DEFAULT_HIDDEN_DAY;
    public static final Integer DEFAULT_IS_TUIGUANG;
    public static final String DEFAULT_MONITOR_ID = "";
    public static final String DEFAULT_POSITION = "";
    public static final String DEFAULT_TAG_NAME = "";
    public static final String DEFAULT_TAG_NAME_URL = "";
    public static final String DEFAULT_TAG_NAME_WH = "";
    public static final Long DEFAULT_TEMPLATE_ID;
    public static final Integer DEFAULT_TEMPLATE_TYPE;
    public static final List<Timgs> DEFAULT_T_IMGS;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(label = Message.Label.REPEATED, tag = 5)
    public final List<ActBtn> act_btn;
    @ProtoField(tag = 7)
    public final DetailInfo detail_info;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer hidden_day;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer is_tuiguang;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String monitor_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String position;
    @ProtoField(label = Message.Label.REPEATED, tag = 6)
    public final List<Timgs> t_imgs;
    @ProtoField(tag = 10)
    public final VideoInfo t_video;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String tag_name;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String tag_name_url;
    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public final String tag_name_wh;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long template_id;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer template_type;

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<TPointPost> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public List<ActBtn> act_btn;
        public DetailInfo detail_info;
        public Integer hidden_day;
        public Integer is_tuiguang;
        public String monitor_id;
        public String position;
        public List<Timgs> t_imgs;
        public VideoInfo t_video;
        public String tag_name;
        public String tag_name_url;
        public String tag_name_wh;
        public Long template_id;
        public Integer template_type;

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
        public Builder(TPointPost tPointPost) {
            super(tPointPost);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {tPointPost};
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
            if (tPointPost == null) {
                return;
            }
            this.is_tuiguang = tPointPost.is_tuiguang;
            this.position = tPointPost.position;
            this.template_id = tPointPost.template_id;
            this.template_type = tPointPost.template_type;
            this.act_btn = Message.copyOf(tPointPost.act_btn);
            this.t_imgs = Message.copyOf(tPointPost.t_imgs);
            this.detail_info = tPointPost.detail_info;
            this.monitor_id = tPointPost.monitor_id;
            this.hidden_day = tPointPost.hidden_day;
            this.t_video = tPointPost.t_video;
            this.tag_name = tPointPost.tag_name;
            this.tag_name_url = tPointPost.tag_name_url;
            this.tag_name_wh = tPointPost.tag_name_wh;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TPointPost build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new TPointPost(this, z, null);
            }
            return (TPointPost) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1724244907, "Ltbclient/TPointPost;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1724244907, "Ltbclient/TPointPost;");
                return;
            }
        }
        DEFAULT_IS_TUIGUANG = 0;
        DEFAULT_TEMPLATE_ID = 0L;
        DEFAULT_TEMPLATE_TYPE = 0;
        DEFAULT_ACT_BTN = Collections.emptyList();
        DEFAULT_T_IMGS = Collections.emptyList();
        DEFAULT_HIDDEN_DAY = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TPointPost(Builder builder, boolean z) {
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
            Integer num = builder.is_tuiguang;
            if (num == null) {
                this.is_tuiguang = DEFAULT_IS_TUIGUANG;
            } else {
                this.is_tuiguang = num;
            }
            String str = builder.position;
            if (str == null) {
                this.position = "";
            } else {
                this.position = str;
            }
            Long l = builder.template_id;
            if (l == null) {
                this.template_id = DEFAULT_TEMPLATE_ID;
            } else {
                this.template_id = l;
            }
            Integer num2 = builder.template_type;
            if (num2 == null) {
                this.template_type = DEFAULT_TEMPLATE_TYPE;
            } else {
                this.template_type = num2;
            }
            List<ActBtn> list = builder.act_btn;
            if (list == null) {
                this.act_btn = DEFAULT_ACT_BTN;
            } else {
                this.act_btn = Message.immutableCopyOf(list);
            }
            List<Timgs> list2 = builder.t_imgs;
            if (list2 == null) {
                this.t_imgs = DEFAULT_T_IMGS;
            } else {
                this.t_imgs = Message.immutableCopyOf(list2);
            }
            this.detail_info = builder.detail_info;
            String str2 = builder.monitor_id;
            if (str2 == null) {
                this.monitor_id = "";
            } else {
                this.monitor_id = str2;
            }
            Integer num3 = builder.hidden_day;
            if (num3 == null) {
                this.hidden_day = DEFAULT_HIDDEN_DAY;
            } else {
                this.hidden_day = num3;
            }
            this.t_video = builder.t_video;
            String str3 = builder.tag_name;
            if (str3 == null) {
                this.tag_name = "";
            } else {
                this.tag_name = str3;
            }
            String str4 = builder.tag_name_url;
            if (str4 == null) {
                this.tag_name_url = "";
            } else {
                this.tag_name_url = str4;
            }
            String str5 = builder.tag_name_wh;
            if (str5 == null) {
                this.tag_name_wh = "";
                return;
            } else {
                this.tag_name_wh = str5;
                return;
            }
        }
        this.is_tuiguang = builder.is_tuiguang;
        this.position = builder.position;
        this.template_id = builder.template_id;
        this.template_type = builder.template_type;
        this.act_btn = Message.immutableCopyOf(builder.act_btn);
        this.t_imgs = Message.immutableCopyOf(builder.t_imgs);
        this.detail_info = builder.detail_info;
        this.monitor_id = builder.monitor_id;
        this.hidden_day = builder.hidden_day;
        this.t_video = builder.t_video;
        this.tag_name = builder.tag_name;
        this.tag_name_url = builder.tag_name_url;
        this.tag_name_wh = builder.tag_name_wh;
    }

    public /* synthetic */ TPointPost(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
