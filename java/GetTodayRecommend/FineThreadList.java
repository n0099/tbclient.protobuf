package tbclient.GetTodayRecommend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class FineThreadList extends Message {
    public static final String DEFAULT_ABSTRACT = "";
    public static final String DEFAULT_FROMFNAME = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String _abstract;
    @ProtoField(tag = 10, type = Message.Datatype.INT64)
    public final Long fromfid;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String fromfname;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long ftid;
    @ProtoField(label = Message.Label.REPEATED, tag = 12, type = Message.Datatype.STRING)
    public final List<String> pics;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer publish_time;
    @ProtoField(tag = 8, type = Message.Datatype.INT64)
    public final Long reply_num;
    @ProtoField(tag = 11, type = Message.Datatype.UINT32)
    public final Integer thread_type;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long tid;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer type;
    @ProtoField(tag = 7, type = Message.Datatype.INT64)
    public final Long zan_num;
    public static final Long DEFAULT_FTID = 0L;
    public static final Long DEFAULT_TID = 0L;
    public static final Integer DEFAULT_TYPE = 0;
    public static final Integer DEFAULT_PUBLISH_TIME = 0;
    public static final Long DEFAULT_ZAN_NUM = 0L;
    public static final Long DEFAULT_REPLY_NUM = 0L;
    public static final Long DEFAULT_FROMFID = 0L;
    public static final Integer DEFAULT_THREAD_TYPE = 0;
    public static final List<String> DEFAULT_PICS = Collections.emptyList();

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<FineThreadList> {
        public String _abstract;
        public Long fromfid;
        public String fromfname;
        public Long ftid;
        public List<String> pics;
        public Integer publish_time;
        public Long reply_num;
        public Integer thread_type;
        public Long tid;
        public String title;
        public Integer type;
        public Long zan_num;

        public Builder() {
        }

        public Builder(FineThreadList fineThreadList) {
            super(fineThreadList);
            if (fineThreadList == null) {
                return;
            }
            this.ftid = fineThreadList.ftid;
            this.tid = fineThreadList.tid;
            this.title = fineThreadList.title;
            this.type = fineThreadList.type;
            this._abstract = fineThreadList._abstract;
            this.publish_time = fineThreadList.publish_time;
            this.zan_num = fineThreadList.zan_num;
            this.reply_num = fineThreadList.reply_num;
            this.fromfname = fineThreadList.fromfname;
            this.fromfid = fineThreadList.fromfid;
            this.thread_type = fineThreadList.thread_type;
            this.pics = Message.copyOf(fineThreadList.pics);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FineThreadList build(boolean z) {
            return new FineThreadList(this, z);
        }
    }

    public FineThreadList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.ftid;
            if (l == null) {
                this.ftid = DEFAULT_FTID;
            } else {
                this.ftid = l;
            }
            Long l2 = builder.tid;
            if (l2 == null) {
                this.tid = DEFAULT_TID;
            } else {
                this.tid = l2;
            }
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            String str2 = builder._abstract;
            if (str2 == null) {
                this._abstract = "";
            } else {
                this._abstract = str2;
            }
            Integer num2 = builder.publish_time;
            if (num2 == null) {
                this.publish_time = DEFAULT_PUBLISH_TIME;
            } else {
                this.publish_time = num2;
            }
            Long l3 = builder.zan_num;
            if (l3 == null) {
                this.zan_num = DEFAULT_ZAN_NUM;
            } else {
                this.zan_num = l3;
            }
            Long l4 = builder.reply_num;
            if (l4 == null) {
                this.reply_num = DEFAULT_REPLY_NUM;
            } else {
                this.reply_num = l4;
            }
            String str3 = builder.fromfname;
            if (str3 == null) {
                this.fromfname = "";
            } else {
                this.fromfname = str3;
            }
            Long l5 = builder.fromfid;
            if (l5 == null) {
                this.fromfid = DEFAULT_FROMFID;
            } else {
                this.fromfid = l5;
            }
            Integer num3 = builder.thread_type;
            if (num3 == null) {
                this.thread_type = DEFAULT_THREAD_TYPE;
            } else {
                this.thread_type = num3;
            }
            List<String> list = builder.pics;
            if (list == null) {
                this.pics = DEFAULT_PICS;
                return;
            } else {
                this.pics = Message.immutableCopyOf(list);
                return;
            }
        }
        this.ftid = builder.ftid;
        this.tid = builder.tid;
        this.title = builder.title;
        this.type = builder.type;
        this._abstract = builder._abstract;
        this.publish_time = builder.publish_time;
        this.zan_num = builder.zan_num;
        this.reply_num = builder.reply_num;
        this.fromfname = builder.fromfname;
        this.fromfid = builder.fromfid;
        this.thread_type = builder.thread_type;
        this.pics = Message.immutableCopyOf(builder.pics);
    }
}
