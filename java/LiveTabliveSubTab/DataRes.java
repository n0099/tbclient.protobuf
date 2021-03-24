package tbclient.LiveTabliveSubTab;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.LiveLabelInfo;
import tbclient.ThreadInfo;
/* loaded from: classes.dex */
public final class DataRes extends Message {
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer has_more;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<LiveLabelInfo> label;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ThreadInfo> live;
    public static final List<ThreadInfo> DEFAULT_LIVE = Collections.emptyList();
    public static final Integer DEFAULT_HAS_MORE = 0;
    public static final List<LiveLabelInfo> DEFAULT_LABEL = Collections.emptyList();

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public Integer has_more;
        public List<LiveLabelInfo> label;
        public List<ThreadInfo> live;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.live = Message.copyOf(dataRes.live);
            this.has_more = dataRes.has_more;
            this.label = Message.copyOf(dataRes.label);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<ThreadInfo> list = builder.live;
            if (list == null) {
                this.live = DEFAULT_LIVE;
            } else {
                this.live = Message.immutableCopyOf(list);
            }
            Integer num = builder.has_more;
            if (num == null) {
                this.has_more = DEFAULT_HAS_MORE;
            } else {
                this.has_more = num;
            }
            List<LiveLabelInfo> list2 = builder.label;
            if (list2 == null) {
                this.label = DEFAULT_LABEL;
                return;
            } else {
                this.label = Message.immutableCopyOf(list2);
                return;
            }
        }
        this.live = Message.immutableCopyOf(builder.live);
        this.has_more = builder.has_more;
        this.label = Message.immutableCopyOf(builder.label);
    }
}
