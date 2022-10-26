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
public final class Anti extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_BLOCK_STAT;
    public static final Integer DEFAULT_CAN_GOODS;
    public static final Integer DEFAULT_DAYS_TOFREE;
    public static final List<DelThreadText> DEFAULT_DEL_THREAD_TEXT;
    public static final Integer DEFAULT_FORBID_FLAG;
    public static final String DEFAULT_FORBID_INFO = "";
    public static final Integer DEFAULT_HAS_CHANCE;
    public static final Integer DEFAULT_HIDE_STAT;
    public static final Integer DEFAULT_IFADDITION;
    public static final Integer DEFAULT_IFPOST;
    public static final Integer DEFAULT_IFPOSTA;
    public static final Integer DEFAULT_IFVOICE;
    public static final String DEFAULT_IFXIAOYING = "";
    public static final Boolean DEFAULT_IS_SEXYFORUM;
    public static final Integer DEFAULT_MULTI_DELTHREAD;
    public static final Integer DEFAULT_NEED_VCODE;
    public static final Integer DEFAULT_POLL_LEVEL;
    public static final String DEFAULT_POLL_MESSAGE = "";
    public static final Integer DEFAULT_REPLY_PRIVATE_FLAG;
    public static final String DEFAULT_TBS = "";
    public static final String DEFAULT_TEENMODE_INTERVAL = "";
    public static final Integer DEFAULT_USER_CHAT_BLOCK;
    public static final String DEFAULT_USER_MUTE = "";
    public static final String DEFAULT_VCODE_MD5 = "";
    public static final String DEFAULT_VCODE_PIC_URL = "";
    public static final Integer DEFAULT_VCODE_STAT;
    public static final String DEFAULT_VIDEO_LOCAL_MESSAGE = "";
    public static final String DEFAULT_VIDEO_MESSAGE = "";
    public static final String DEFAULT_VOICE_MESSAGE = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 22)
    public final BlockPopInfo block_pop_info;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer block_stat;
    @ProtoField(tag = 27, type = Message.Datatype.INT32)
    public final Integer can_goods;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer days_tofree;
    @ProtoField(label = Message.Label.REPEATED, tag = 24)
    public final List<DelThreadText> del_thread_text;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer forbid_flag;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String forbid_info;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer has_chance;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer hide_stat;
    @ProtoField(tag = 13, type = Message.Datatype.INT32)
    public final Integer ifaddition;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer ifpost;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer ifposta;
    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer ifvoice;
    @ProtoField(tag = 18, type = Message.Datatype.STRING)
    public final String ifxiaoying;
    @ProtoField(tag = 28, type = Message.Datatype.BOOL)
    public final Boolean is_sexyforum;
    @ProtoField(tag = 25, type = Message.Datatype.INT32)
    public final Integer multi_delthread;
    @ProtoField(tag = 14, type = Message.Datatype.INT32)
    public final Integer need_vcode;
    @ProtoField(tag = 26, type = Message.Datatype.UINT32)
    public final Integer poll_level;
    @ProtoField(tag = 19, type = Message.Datatype.STRING)
    public final String poll_message;
    @ProtoField(tag = 23, type = Message.Datatype.INT32)
    public final Integer reply_private_flag;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String tbs;
    @ProtoField(tag = 29, type = Message.Datatype.STRING)
    public final String teenmode_interval;
    @ProtoField(tag = 30, type = Message.Datatype.INT32)
    public final Integer user_chat_block;
    @ProtoField(tag = 17, type = Message.Datatype.STRING)
    public final String user_mute;
    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public final String vcode_md5;
    @ProtoField(tag = 16, type = Message.Datatype.STRING)
    public final String vcode_pic_url;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer vcode_stat;
    @ProtoField(tag = 21, type = Message.Datatype.STRING)
    public final String video_local_message;
    @ProtoField(tag = 20, type = Message.Datatype.STRING)
    public final String video_message;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String voice_message;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public BlockPopInfo block_pop_info;
        public Integer block_stat;
        public Integer can_goods;
        public Integer days_tofree;
        public List del_thread_text;
        public Integer forbid_flag;
        public String forbid_info;
        public Integer has_chance;
        public Integer hide_stat;
        public Integer ifaddition;
        public Integer ifpost;
        public Integer ifposta;
        public Integer ifvoice;
        public String ifxiaoying;
        public Boolean is_sexyforum;
        public Integer multi_delthread;
        public Integer need_vcode;
        public Integer poll_level;
        public String poll_message;
        public Integer reply_private_flag;
        public String tbs;
        public String teenmode_interval;
        public Integer user_chat_block;
        public String user_mute;
        public String vcode_md5;
        public String vcode_pic_url;
        public Integer vcode_stat;
        public String video_local_message;
        public String video_message;
        public String voice_message;

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
        public Builder(Anti anti) {
            super(anti);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {anti};
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
            if (anti == null) {
                return;
            }
            this.tbs = anti.tbs;
            this.ifpost = anti.ifpost;
            this.ifposta = anti.ifposta;
            this.forbid_flag = anti.forbid_flag;
            this.forbid_info = anti.forbid_info;
            this.block_stat = anti.block_stat;
            this.hide_stat = anti.hide_stat;
            this.vcode_stat = anti.vcode_stat;
            this.days_tofree = anti.days_tofree;
            this.has_chance = anti.has_chance;
            this.ifvoice = anti.ifvoice;
            this.voice_message = anti.voice_message;
            this.ifaddition = anti.ifaddition;
            this.need_vcode = anti.need_vcode;
            this.vcode_md5 = anti.vcode_md5;
            this.vcode_pic_url = anti.vcode_pic_url;
            this.user_mute = anti.user_mute;
            this.ifxiaoying = anti.ifxiaoying;
            this.poll_message = anti.poll_message;
            this.video_message = anti.video_message;
            this.video_local_message = anti.video_local_message;
            this.block_pop_info = anti.block_pop_info;
            this.reply_private_flag = anti.reply_private_flag;
            this.del_thread_text = Message.copyOf(anti.del_thread_text);
            this.multi_delthread = anti.multi_delthread;
            this.poll_level = anti.poll_level;
            this.can_goods = anti.can_goods;
            this.is_sexyforum = anti.is_sexyforum;
            this.teenmode_interval = anti.teenmode_interval;
            this.user_chat_block = anti.user_chat_block;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Anti build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new Anti(this, z, null);
            }
            return (Anti) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1104637329, "Ltbclient/Anti;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1104637329, "Ltbclient/Anti;");
                return;
            }
        }
        DEFAULT_IFPOST = 0;
        DEFAULT_IFPOSTA = 0;
        DEFAULT_FORBID_FLAG = 0;
        DEFAULT_BLOCK_STAT = 0;
        DEFAULT_HIDE_STAT = 0;
        DEFAULT_VCODE_STAT = 0;
        DEFAULT_DAYS_TOFREE = 0;
        DEFAULT_HAS_CHANCE = 0;
        DEFAULT_IFVOICE = 0;
        DEFAULT_IFADDITION = 0;
        DEFAULT_NEED_VCODE = 0;
        DEFAULT_REPLY_PRIVATE_FLAG = 0;
        DEFAULT_DEL_THREAD_TEXT = Collections.emptyList();
        DEFAULT_MULTI_DELTHREAD = 0;
        DEFAULT_POLL_LEVEL = 0;
        DEFAULT_CAN_GOODS = 0;
        DEFAULT_IS_SEXYFORUM = Boolean.FALSE;
        DEFAULT_USER_CHAT_BLOCK = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Anti(Builder builder, boolean z) {
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
            String str = builder.tbs;
            if (str == null) {
                this.tbs = "";
            } else {
                this.tbs = str;
            }
            Integer num = builder.ifpost;
            if (num == null) {
                this.ifpost = DEFAULT_IFPOST;
            } else {
                this.ifpost = num;
            }
            Integer num2 = builder.ifposta;
            if (num2 == null) {
                this.ifposta = DEFAULT_IFPOSTA;
            } else {
                this.ifposta = num2;
            }
            Integer num3 = builder.forbid_flag;
            if (num3 == null) {
                this.forbid_flag = DEFAULT_FORBID_FLAG;
            } else {
                this.forbid_flag = num3;
            }
            String str2 = builder.forbid_info;
            if (str2 == null) {
                this.forbid_info = "";
            } else {
                this.forbid_info = str2;
            }
            Integer num4 = builder.block_stat;
            if (num4 == null) {
                this.block_stat = DEFAULT_BLOCK_STAT;
            } else {
                this.block_stat = num4;
            }
            Integer num5 = builder.hide_stat;
            if (num5 == null) {
                this.hide_stat = DEFAULT_HIDE_STAT;
            } else {
                this.hide_stat = num5;
            }
            Integer num6 = builder.vcode_stat;
            if (num6 == null) {
                this.vcode_stat = DEFAULT_VCODE_STAT;
            } else {
                this.vcode_stat = num6;
            }
            Integer num7 = builder.days_tofree;
            if (num7 == null) {
                this.days_tofree = DEFAULT_DAYS_TOFREE;
            } else {
                this.days_tofree = num7;
            }
            Integer num8 = builder.has_chance;
            if (num8 == null) {
                this.has_chance = DEFAULT_HAS_CHANCE;
            } else {
                this.has_chance = num8;
            }
            Integer num9 = builder.ifvoice;
            if (num9 == null) {
                this.ifvoice = DEFAULT_IFVOICE;
            } else {
                this.ifvoice = num9;
            }
            String str3 = builder.voice_message;
            if (str3 == null) {
                this.voice_message = "";
            } else {
                this.voice_message = str3;
            }
            Integer num10 = builder.ifaddition;
            if (num10 == null) {
                this.ifaddition = DEFAULT_IFADDITION;
            } else {
                this.ifaddition = num10;
            }
            Integer num11 = builder.need_vcode;
            if (num11 == null) {
                this.need_vcode = DEFAULT_NEED_VCODE;
            } else {
                this.need_vcode = num11;
            }
            String str4 = builder.vcode_md5;
            if (str4 == null) {
                this.vcode_md5 = "";
            } else {
                this.vcode_md5 = str4;
            }
            String str5 = builder.vcode_pic_url;
            if (str5 == null) {
                this.vcode_pic_url = "";
            } else {
                this.vcode_pic_url = str5;
            }
            String str6 = builder.user_mute;
            if (str6 == null) {
                this.user_mute = "";
            } else {
                this.user_mute = str6;
            }
            String str7 = builder.ifxiaoying;
            if (str7 == null) {
                this.ifxiaoying = "";
            } else {
                this.ifxiaoying = str7;
            }
            String str8 = builder.poll_message;
            if (str8 == null) {
                this.poll_message = "";
            } else {
                this.poll_message = str8;
            }
            String str9 = builder.video_message;
            if (str9 == null) {
                this.video_message = "";
            } else {
                this.video_message = str9;
            }
            String str10 = builder.video_local_message;
            if (str10 == null) {
                this.video_local_message = "";
            } else {
                this.video_local_message = str10;
            }
            this.block_pop_info = builder.block_pop_info;
            Integer num12 = builder.reply_private_flag;
            if (num12 == null) {
                this.reply_private_flag = DEFAULT_REPLY_PRIVATE_FLAG;
            } else {
                this.reply_private_flag = num12;
            }
            List list = builder.del_thread_text;
            if (list == null) {
                this.del_thread_text = DEFAULT_DEL_THREAD_TEXT;
            } else {
                this.del_thread_text = Message.immutableCopyOf(list);
            }
            Integer num13 = builder.multi_delthread;
            if (num13 == null) {
                this.multi_delthread = DEFAULT_MULTI_DELTHREAD;
            } else {
                this.multi_delthread = num13;
            }
            Integer num14 = builder.poll_level;
            if (num14 == null) {
                this.poll_level = DEFAULT_POLL_LEVEL;
            } else {
                this.poll_level = num14;
            }
            Integer num15 = builder.can_goods;
            if (num15 == null) {
                this.can_goods = DEFAULT_CAN_GOODS;
            } else {
                this.can_goods = num15;
            }
            Boolean bool = builder.is_sexyforum;
            if (bool == null) {
                this.is_sexyforum = DEFAULT_IS_SEXYFORUM;
            } else {
                this.is_sexyforum = bool;
            }
            String str11 = builder.teenmode_interval;
            if (str11 == null) {
                this.teenmode_interval = "";
            } else {
                this.teenmode_interval = str11;
            }
            Integer num16 = builder.user_chat_block;
            if (num16 == null) {
                this.user_chat_block = DEFAULT_USER_CHAT_BLOCK;
                return;
            } else {
                this.user_chat_block = num16;
                return;
            }
        }
        this.tbs = builder.tbs;
        this.ifpost = builder.ifpost;
        this.ifposta = builder.ifposta;
        this.forbid_flag = builder.forbid_flag;
        this.forbid_info = builder.forbid_info;
        this.block_stat = builder.block_stat;
        this.hide_stat = builder.hide_stat;
        this.vcode_stat = builder.vcode_stat;
        this.days_tofree = builder.days_tofree;
        this.has_chance = builder.has_chance;
        this.ifvoice = builder.ifvoice;
        this.voice_message = builder.voice_message;
        this.ifaddition = builder.ifaddition;
        this.need_vcode = builder.need_vcode;
        this.vcode_md5 = builder.vcode_md5;
        this.vcode_pic_url = builder.vcode_pic_url;
        this.user_mute = builder.user_mute;
        this.ifxiaoying = builder.ifxiaoying;
        this.poll_message = builder.poll_message;
        this.video_message = builder.video_message;
        this.video_local_message = builder.video_local_message;
        this.block_pop_info = builder.block_pop_info;
        this.reply_private_flag = builder.reply_private_flag;
        this.del_thread_text = Message.immutableCopyOf(builder.del_thread_text);
        this.multi_delthread = builder.multi_delthread;
        this.poll_level = builder.poll_level;
        this.can_goods = builder.can_goods;
        this.is_sexyforum = builder.is_sexyforum;
        this.teenmode_interval = builder.teenmode_interval;
        this.user_chat_block = builder.user_chat_block;
    }

    public /* synthetic */ Anti(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
