package tbclient.HotThread;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes3.dex */
public final class tinfo extends Message {
    public static final String DEFAULT_ABSTRACT = "";
    public static final String DEFAULT_FORUM_NAME = "";
    public static final String DEFAULT_TITLE = "";
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
    public static final Long DEFAULT_THREAD_ID = 0L;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Integer DEFAULT_REPLY_NUM = 0;
    public static final Long DEFAULT_CREATE_TIME = 0L;
    public static final Integer DEFAULT_ZAN_NUM = 0;
    public static final Integer DEFAULT_TYPE = 0;
    public static final List<Pic> DEFAULT_PICS = Collections.emptyList();
    public static final Integer DEFAULT_IS_GOOD = 0;
    public static final Integer DEFAULT_IS_TOP = 0;
    public static final Integer DEFAULT_IS_MEMBERTOP = 0;
    public static final Integer DEFAULT_IS_ACTIVITY = 0;
    public static final Integer DEFAULT_IS_LIVEPOST = 0;

    private tinfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.thread_id == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = builder.thread_id;
            }
            if (builder.forum_id == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = builder.forum_id;
            }
            if (builder.forum_name == null) {
                this.forum_name = "";
            } else {
                this.forum_name = builder.forum_name;
            }
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.reply_num == null) {
                this.reply_num = DEFAULT_REPLY_NUM;
            } else {
                this.reply_num = builder.reply_num;
            }
            if (builder.create_time == null) {
                this.create_time = DEFAULT_CREATE_TIME;
            } else {
                this.create_time = builder.create_time;
            }
            if (builder.zan_num == null) {
                this.zan_num = DEFAULT_ZAN_NUM;
            } else {
                this.zan_num = builder.zan_num;
            }
            if (builder._abstract == null) {
                this._abstract = "";
            } else {
                this._abstract = builder._abstract;
            }
            if (builder.type == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = builder.type;
            }
            if (builder.pics == null) {
                this.pics = DEFAULT_PICS;
            } else {
                this.pics = immutableCopyOf(builder.pics);
            }
            if (builder.is_good == null) {
                this.is_good = DEFAULT_IS_GOOD;
            } else {
                this.is_good = builder.is_good;
            }
            if (builder.is_top == null) {
                this.is_top = DEFAULT_IS_TOP;
            } else {
                this.is_top = builder.is_top;
            }
            if (builder.is_membertop == null) {
                this.is_membertop = DEFAULT_IS_MEMBERTOP;
            } else {
                this.is_membertop = builder.is_membertop;
            }
            if (builder.is_activity == null) {
                this.is_activity = DEFAULT_IS_ACTIVITY;
            } else {
                this.is_activity = builder.is_activity;
            }
            if (builder.is_livepost == null) {
                this.is_livepost = DEFAULT_IS_LIVEPOST;
                return;
            } else {
                this.is_livepost = builder.is_livepost;
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
        this.pics = immutableCopyOf(builder.pics);
        this.is_good = builder.is_good;
        this.is_top = builder.is_top;
        this.is_membertop = builder.is_membertop;
        this.is_activity = builder.is_activity;
        this.is_livepost = builder.is_livepost;
    }

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<tinfo> {
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
        }

        public Builder(tinfo tinfoVar) {
            super(tinfoVar);
            if (tinfoVar != null) {
                this.thread_id = tinfoVar.thread_id;
                this.forum_id = tinfoVar.forum_id;
                this.forum_name = tinfoVar.forum_name;
                this.title = tinfoVar.title;
                this.reply_num = tinfoVar.reply_num;
                this.create_time = tinfoVar.create_time;
                this.zan_num = tinfoVar.zan_num;
                this._abstract = tinfoVar._abstract;
                this.type = tinfoVar.type;
                this.pics = tinfo.copyOf(tinfoVar.pics);
                this.is_good = tinfoVar.is_good;
                this.is_top = tinfoVar.is_top;
                this.is_membertop = tinfoVar.is_membertop;
                this.is_activity = tinfoVar.is_activity;
                this.is_livepost = tinfoVar.is_livepost;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public tinfo build(boolean z) {
            return new tinfo(this, z);
        }
    }
}