package tbclient.HotThread;

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
/* loaded from: classes3.dex */
public final class tinfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_ABSTRACT = "";
    public static final Long DEFAULT_CREATE_TIME;
    public static final Long DEFAULT_FORUM_ID;
    public static final String DEFAULT_FORUM_NAME = "";
    public static final Integer DEFAULT_IS_ACTIVITY;
    public static final Integer DEFAULT_IS_GOOD;
    public static final Integer DEFAULT_IS_LIVEPOST;
    public static final Integer DEFAULT_IS_MEMBERTOP;
    public static final Integer DEFAULT_IS_TOP;
    public static final List<Pic> DEFAULT_PICS;
    public static final Integer DEFAULT_REPLY_NUM;
    public static final Long DEFAULT_THREAD_ID;
    public static final String DEFAULT_TITLE = "";
    public static final Integer DEFAULT_TYPE;
    public static final Integer DEFAULT_ZAN_NUM;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String _abstract;
    @ProtoField(tag = 6, type = Message.Datatype.UINT64)
    public final Long create_time;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long forum_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 14, type = Message.Datatype.UINT32)
    public final Integer is_activity;
    @ProtoField(tag = 11, type = Message.Datatype.UINT32)
    public final Integer is_good;
    @ProtoField(tag = 15, type = Message.Datatype.UINT32)
    public final Integer is_livepost;
    @ProtoField(tag = 13, type = Message.Datatype.UINT32)
    public final Integer is_membertop;
    @ProtoField(tag = 12, type = Message.Datatype.UINT32)
    public final Integer is_top;
    @ProtoField(label = Message.Label.REPEATED, tag = 10)
    public final List<Pic> pics;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer reply_num;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long thread_id;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 9, type = Message.Datatype.UINT32)
    public final Integer type;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer zan_num;

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<tinfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String _abstract;
        public Long create_time;
        public Long forum_id;
        public String forum_name;
        public Integer is_activity;
        public Integer is_good;
        public Integer is_livepost;
        public Integer is_membertop;
        public Integer is_top;
        public List<Pic> pics;
        public Integer reply_num;
        public Long thread_id;
        public String title;
        public Integer type;
        public Integer zan_num;

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
        public Builder(tinfo tinfoVar) {
            super(tinfoVar);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {tinfoVar};
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
            if (tinfoVar == null) {
                return;
            }
            this.thread_id = tinfoVar.thread_id;
            this.forum_id = tinfoVar.forum_id;
            this.forum_name = tinfoVar.forum_name;
            this.title = tinfoVar.title;
            this.reply_num = tinfoVar.reply_num;
            this.create_time = tinfoVar.create_time;
            this.zan_num = tinfoVar.zan_num;
            this._abstract = tinfoVar._abstract;
            this.type = tinfoVar.type;
            this.pics = Message.copyOf(tinfoVar.pics);
            this.is_good = tinfoVar.is_good;
            this.is_top = tinfoVar.is_top;
            this.is_membertop = tinfoVar.is_membertop;
            this.is_activity = tinfoVar.is_activity;
            this.is_livepost = tinfoVar.is_livepost;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public tinfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new tinfo(this, z, null) : (tinfo) invokeZ.objValue;
        }
    }

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1080619675, "Ltbclient/HotThread/tinfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1080619675, "Ltbclient/HotThread/tinfo;");
                return;
            }
        }
        DEFAULT_THREAD_ID = 0L;
        DEFAULT_FORUM_ID = 0L;
        DEFAULT_REPLY_NUM = 0;
        DEFAULT_CREATE_TIME = 0L;
        DEFAULT_ZAN_NUM = 0;
        DEFAULT_TYPE = 0;
        DEFAULT_PICS = Collections.emptyList();
        DEFAULT_IS_GOOD = 0;
        DEFAULT_IS_TOP = 0;
        DEFAULT_IS_MEMBERTOP = 0;
        DEFAULT_IS_ACTIVITY = 0;
        DEFAULT_IS_LIVEPOST = 0;
    }

    public /* synthetic */ tinfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tinfo(Builder builder, boolean z) {
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
            Long l = builder.thread_id;
            if (l == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = l;
            }
            Long l2 = builder.forum_id;
            if (l2 == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l2;
            }
            String str = builder.forum_name;
            if (str == null) {
                this.forum_name = "";
            } else {
                this.forum_name = str;
            }
            String str2 = builder.title;
            if (str2 == null) {
                this.title = "";
            } else {
                this.title = str2;
            }
            Integer num = builder.reply_num;
            if (num == null) {
                this.reply_num = DEFAULT_REPLY_NUM;
            } else {
                this.reply_num = num;
            }
            Long l3 = builder.create_time;
            if (l3 == null) {
                this.create_time = DEFAULT_CREATE_TIME;
            } else {
                this.create_time = l3;
            }
            Integer num2 = builder.zan_num;
            if (num2 == null) {
                this.zan_num = DEFAULT_ZAN_NUM;
            } else {
                this.zan_num = num2;
            }
            String str3 = builder._abstract;
            if (str3 == null) {
                this._abstract = "";
            } else {
                this._abstract = str3;
            }
            Integer num3 = builder.type;
            if (num3 == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num3;
            }
            List<Pic> list = builder.pics;
            if (list == null) {
                this.pics = DEFAULT_PICS;
            } else {
                this.pics = Message.immutableCopyOf(list);
            }
            Integer num4 = builder.is_good;
            if (num4 == null) {
                this.is_good = DEFAULT_IS_GOOD;
            } else {
                this.is_good = num4;
            }
            Integer num5 = builder.is_top;
            if (num5 == null) {
                this.is_top = DEFAULT_IS_TOP;
            } else {
                this.is_top = num5;
            }
            Integer num6 = builder.is_membertop;
            if (num6 == null) {
                this.is_membertop = DEFAULT_IS_MEMBERTOP;
            } else {
                this.is_membertop = num6;
            }
            Integer num7 = builder.is_activity;
            if (num7 == null) {
                this.is_activity = DEFAULT_IS_ACTIVITY;
            } else {
                this.is_activity = num7;
            }
            Integer num8 = builder.is_livepost;
            if (num8 == null) {
                this.is_livepost = DEFAULT_IS_LIVEPOST;
                return;
            } else {
                this.is_livepost = num8;
                return;
            }
        }
        this.thread_id = builder.thread_id;
        this.forum_id = builder.forum_id;
        this.forum_name = builder.forum_name;
        this.title = builder.title;
        this.reply_num = builder.reply_num;
        this.create_time = builder.create_time;
        this.zan_num = builder.zan_num;
        this._abstract = builder._abstract;
        this.type = builder.type;
        this.pics = Message.immutableCopyOf(builder.pics);
        this.is_good = builder.is_good;
        this.is_top = builder.is_top;
        this.is_membertop = builder.is_membertop;
        this.is_activity = builder.is_activity;
        this.is_livepost = builder.is_livepost;
    }
}
