package tbclient.LiveSquare;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThreadInfo;
/* loaded from: classes2.dex */
public final class HeadLiveInfo extends Message {
    public static final String DEFAULT_BITMAP_WH_RATIO = "";
    public static final List<ThreadInfo> DEFAULT_HEAD_LIVE = Collections.emptyList();
    public static final List<String> DEFAULT_HEAD_PIC = Collections.emptyList();
    public static final Integer DEFAULT_IS_SET = 0;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String bitmap_wh_ratio;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ThreadInfo> head_live;
    @ProtoField(label = Message.Label.REPEATED, tag = 2, type = Message.Datatype.STRING)
    public final List<String> head_pic;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer is_set;

    private HeadLiveInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.head_live == null) {
                this.head_live = DEFAULT_HEAD_LIVE;
            } else {
                this.head_live = immutableCopyOf(builder.head_live);
            }
            if (builder.head_pic == null) {
                this.head_pic = DEFAULT_HEAD_PIC;
            } else {
                this.head_pic = immutableCopyOf(builder.head_pic);
            }
            if (builder.bitmap_wh_ratio == null) {
                this.bitmap_wh_ratio = "";
            } else {
                this.bitmap_wh_ratio = builder.bitmap_wh_ratio;
            }
            if (builder.is_set == null) {
                this.is_set = DEFAULT_IS_SET;
                return;
            } else {
                this.is_set = builder.is_set;
                return;
            }
        }
        this.head_live = immutableCopyOf(builder.head_live);
        this.head_pic = immutableCopyOf(builder.head_pic);
        this.bitmap_wh_ratio = builder.bitmap_wh_ratio;
        this.is_set = builder.is_set;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<HeadLiveInfo> {
        public String bitmap_wh_ratio;
        public List<ThreadInfo> head_live;
        public List<String> head_pic;
        public Integer is_set;

        public Builder() {
        }

        public Builder(HeadLiveInfo headLiveInfo) {
            super(headLiveInfo);
            if (headLiveInfo != null) {
                this.head_live = HeadLiveInfo.copyOf(headLiveInfo.head_live);
                this.head_pic = HeadLiveInfo.copyOf(headLiveInfo.head_pic);
                this.bitmap_wh_ratio = headLiveInfo.bitmap_wh_ratio;
                this.is_set = headLiveInfo.is_set;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HeadLiveInfo build(boolean z) {
            return new HeadLiveInfo(this, z);
        }
    }
}
