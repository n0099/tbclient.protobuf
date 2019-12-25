package tbclient.NewTopicList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes6.dex */
public final class DataRes extends Message {
    public static final List<NewTopicList> DEFAULT_TOPIC_LIST = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<NewTopicList> topic_list;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.topic_list == null) {
                this.topic_list = DEFAULT_TOPIC_LIST;
                return;
            } else {
                this.topic_list = immutableCopyOf(builder.topic_list);
                return;
            }
        }
        this.topic_list = immutableCopyOf(builder.topic_list);
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<NewTopicList> topic_list;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.topic_list = DataRes.copyOf(dataRes.topic_list);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
