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
public final class Media extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_BIG_PIC = "";
    public static final String DEFAULT_BSIZE = "";
    public static final Integer DEFAULT_DURING_TIME;
    public static final String DEFAULT_DYNAMIC_PIC = "";
    public static final Integer DEFAULT_E_TYPE;
    public static final Integer DEFAULT_HEIGHT;
    public static final Double DEFAULT_HTH_MID_LOC;
    public static final Integer DEFAULT_IS_BLOCKED_PIC;
    public static final Integer DEFAULT_IS_LONG_PIC;
    public static final String DEFAULT_ORIGIN_PIC = "";
    public static final Integer DEFAULT_ORIGIN_SIZE;
    public static final Long DEFAULT_POST_ID;
    public static final Integer DEFAULT_SHOW_ORIGINAL_BTN;
    public static final String DEFAULT_SMALL_PIC = "";
    public static final String DEFAULT_SRC_PIC = "";
    public static final String DEFAULT_TEXT = "";
    public static final Integer DEFAULT_TYPE;
    public static final String DEFAULT_VHSRC = "";
    public static final String DEFAULT_VPIC = "";
    public static final String DEFAULT_VSRC = "";
    public static final String DEFAULT_WATER_PIC = "";
    public static final Integer DEFAULT_WIDTH;
    public static final Double DEFAULT_WTH_MID_LOC;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String big_pic;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String bsize;
    @ProtoField(tag = 13, type = Message.Datatype.UINT32)
    public final Integer during_time;
    @ProtoField(tag = 18, type = Message.Datatype.STRING)
    public final String dynamic_pic;
    @ProtoField(tag = 14, type = Message.Datatype.UINT32)
    public final Integer e_type;
    @ProtoField(tag = 11, type = Message.Datatype.UINT32)
    public final Integer height;
    @ProtoField(tag = 23, type = Message.Datatype.DOUBLE)
    public final Double hth_mid_loc;
    @ProtoField(tag = 21, type = Message.Datatype.UINT32)
    public final Integer is_blocked_pic;
    @ProtoField(tag = 19, type = Message.Datatype.UINT32)
    public final Integer is_long_pic;
    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public final String origin_pic;
    @ProtoField(tag = 16, type = Message.Datatype.UINT32)
    public final Integer origin_size;
    @ProtoField(tag = 17, type = Message.Datatype.INT64)
    public final Long post_id;
    @ProtoField(tag = 20, type = Message.Datatype.UINT32)
    public final Integer show_original_btn;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String small_pic;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String src_pic;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String text;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer type;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String vhsrc;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String vpic;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String vsrc;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String water_pic;
    @ProtoField(tag = 10, type = Message.Datatype.UINT32)
    public final Integer width;
    @ProtoField(tag = 22, type = Message.Datatype.DOUBLE)
    public final Double wth_mid_loc;

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<Media> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String big_pic;
        public String bsize;
        public Integer during_time;
        public String dynamic_pic;
        public Integer e_type;
        public Integer height;
        public Double hth_mid_loc;
        public Integer is_blocked_pic;
        public Integer is_long_pic;
        public String origin_pic;
        public Integer origin_size;
        public Long post_id;
        public Integer show_original_btn;
        public String small_pic;
        public String src_pic;
        public String text;
        public Integer type;
        public String vhsrc;
        public String vpic;
        public String vsrc;
        public String water_pic;
        public Integer width;
        public Double wth_mid_loc;

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
        public Builder(Media media) {
            super(media);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {media};
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
            if (media == null) {
                return;
            }
            this.type = media.type;
            this.small_pic = media.small_pic;
            this.big_pic = media.big_pic;
            this.water_pic = media.water_pic;
            this.vpic = media.vpic;
            this.vsrc = media.vsrc;
            this.vhsrc = media.vhsrc;
            this.src_pic = media.src_pic;
            this.text = media.text;
            this.width = media.width;
            this.height = media.height;
            this.bsize = media.bsize;
            this.during_time = media.during_time;
            this.e_type = media.e_type;
            this.origin_pic = media.origin_pic;
            this.origin_size = media.origin_size;
            this.post_id = media.post_id;
            this.dynamic_pic = media.dynamic_pic;
            this.is_long_pic = media.is_long_pic;
            this.show_original_btn = media.show_original_btn;
            this.is_blocked_pic = media.is_blocked_pic;
            this.wth_mid_loc = media.wth_mid_loc;
            this.hth_mid_loc = media.hth_mid_loc;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Media build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new Media(this, z, null) : (Media) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(450743873, "Ltbclient/Media;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(450743873, "Ltbclient/Media;");
                return;
            }
        }
        DEFAULT_TYPE = 0;
        DEFAULT_WIDTH = 0;
        DEFAULT_HEIGHT = 0;
        DEFAULT_DURING_TIME = 0;
        DEFAULT_E_TYPE = 0;
        DEFAULT_ORIGIN_SIZE = 0;
        DEFAULT_POST_ID = 0L;
        DEFAULT_IS_LONG_PIC = 0;
        DEFAULT_SHOW_ORIGINAL_BTN = 0;
        DEFAULT_IS_BLOCKED_PIC = 0;
        Double valueOf = Double.valueOf(0.0d);
        DEFAULT_WTH_MID_LOC = valueOf;
        DEFAULT_HTH_MID_LOC = valueOf;
    }

    public /* synthetic */ Media(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Media(Builder builder, boolean z) {
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
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            String str = builder.small_pic;
            if (str == null) {
                this.small_pic = "";
            } else {
                this.small_pic = str;
            }
            String str2 = builder.big_pic;
            if (str2 == null) {
                this.big_pic = "";
            } else {
                this.big_pic = str2;
            }
            String str3 = builder.water_pic;
            if (str3 == null) {
                this.water_pic = "";
            } else {
                this.water_pic = str3;
            }
            String str4 = builder.vpic;
            if (str4 == null) {
                this.vpic = "";
            } else {
                this.vpic = str4;
            }
            String str5 = builder.vsrc;
            if (str5 == null) {
                this.vsrc = "";
            } else {
                this.vsrc = str5;
            }
            String str6 = builder.vhsrc;
            if (str6 == null) {
                this.vhsrc = "";
            } else {
                this.vhsrc = str6;
            }
            String str7 = builder.src_pic;
            if (str7 == null) {
                this.src_pic = "";
            } else {
                this.src_pic = str7;
            }
            String str8 = builder.text;
            if (str8 == null) {
                this.text = "";
            } else {
                this.text = str8;
            }
            Integer num2 = builder.width;
            if (num2 == null) {
                this.width = DEFAULT_WIDTH;
            } else {
                this.width = num2;
            }
            Integer num3 = builder.height;
            if (num3 == null) {
                this.height = DEFAULT_HEIGHT;
            } else {
                this.height = num3;
            }
            String str9 = builder.bsize;
            if (str9 == null) {
                this.bsize = "";
            } else {
                this.bsize = str9;
            }
            Integer num4 = builder.during_time;
            if (num4 == null) {
                this.during_time = DEFAULT_DURING_TIME;
            } else {
                this.during_time = num4;
            }
            Integer num5 = builder.e_type;
            if (num5 == null) {
                this.e_type = DEFAULT_E_TYPE;
            } else {
                this.e_type = num5;
            }
            String str10 = builder.origin_pic;
            if (str10 == null) {
                this.origin_pic = "";
            } else {
                this.origin_pic = str10;
            }
            Integer num6 = builder.origin_size;
            if (num6 == null) {
                this.origin_size = DEFAULT_ORIGIN_SIZE;
            } else {
                this.origin_size = num6;
            }
            Long l = builder.post_id;
            if (l == null) {
                this.post_id = DEFAULT_POST_ID;
            } else {
                this.post_id = l;
            }
            String str11 = builder.dynamic_pic;
            if (str11 == null) {
                this.dynamic_pic = "";
            } else {
                this.dynamic_pic = str11;
            }
            Integer num7 = builder.is_long_pic;
            if (num7 == null) {
                this.is_long_pic = DEFAULT_IS_LONG_PIC;
            } else {
                this.is_long_pic = num7;
            }
            Integer num8 = builder.show_original_btn;
            if (num8 == null) {
                this.show_original_btn = DEFAULT_SHOW_ORIGINAL_BTN;
            } else {
                this.show_original_btn = num8;
            }
            Integer num9 = builder.is_blocked_pic;
            if (num9 == null) {
                this.is_blocked_pic = DEFAULT_IS_BLOCKED_PIC;
            } else {
                this.is_blocked_pic = num9;
            }
            Double d2 = builder.wth_mid_loc;
            if (d2 == null) {
                this.wth_mid_loc = DEFAULT_WTH_MID_LOC;
            } else {
                this.wth_mid_loc = d2;
            }
            Double d3 = builder.hth_mid_loc;
            if (d3 == null) {
                this.hth_mid_loc = DEFAULT_HTH_MID_LOC;
                return;
            } else {
                this.hth_mid_loc = d3;
                return;
            }
        }
        this.type = builder.type;
        this.small_pic = builder.small_pic;
        this.big_pic = builder.big_pic;
        this.water_pic = builder.water_pic;
        this.vpic = builder.vpic;
        this.vsrc = builder.vsrc;
        this.vhsrc = builder.vhsrc;
        this.src_pic = builder.src_pic;
        this.text = builder.text;
        this.width = builder.width;
        this.height = builder.height;
        this.bsize = builder.bsize;
        this.during_time = builder.during_time;
        this.e_type = builder.e_type;
        this.origin_pic = builder.origin_pic;
        this.origin_size = builder.origin_size;
        this.post_id = builder.post_id;
        this.dynamic_pic = builder.dynamic_pic;
        this.is_long_pic = builder.is_long_pic;
        this.show_original_btn = builder.show_original_btn;
        this.is_blocked_pic = builder.is_blocked_pic;
        this.wth_mid_loc = builder.wth_mid_loc;
        this.hth_mid_loc = builder.hth_mid_loc;
    }
}
