package tbclient.Hottopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class DataRes extends Message {
    public static final List<RelateForum> DEFAULT_RELATE_FORUM = Collections.emptyList();
    @ProtoField(tag = 3)
    public final HotThread hot_thread;
    @ProtoField(tag = 2)
    public final MagicPost magic_post;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<RelateForum> relate_forum;
    @ProtoField(tag = 4)
    public final TopicInfo topic_info;

    /* synthetic */ DataRes(Builder builder, boolean z, DataRes dataRes) {
        this(builder, z);
    }

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.relate_forum == null) {
                this.relate_forum = DEFAULT_RELATE_FORUM;
            } else {
                this.relate_forum = immutableCopyOf(builder.relate_forum);
            }
            this.magic_post = builder.magic_post;
            this.hot_thread = builder.hot_thread;
            this.topic_info = builder.topic_info;
            return;
        }
        this.relate_forum = immutableCopyOf(builder.relate_forum);
        this.magic_post = builder.magic_post;
        this.hot_thread = builder.hot_thread;
        this.topic_info = builder.topic_info;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public HotThread hot_thread;
        public MagicPost magic_post;
        public List<RelateForum> relate_forum;
        public TopicInfo topic_info;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.relate_forum = DataRes.copyOf(dataRes.relate_forum);
                this.magic_post = dataRes.magic_post;
                this.hot_thread = dataRes.hot_thread;
                this.topic_info = dataRes.topic_info;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z, null);
        }
    }
}
