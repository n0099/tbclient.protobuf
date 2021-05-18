package tbclient.MFollow;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes8.dex */
public final class DataRes extends Message {
    public static final List<MFollowResult> DEFAULT_FOLLOW_RESULTS = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<MFollowResult> follow_results;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<MFollowResult> follow_results;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.follow_results = Message.copyOf(dataRes.follow_results);
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
            List<MFollowResult> list = builder.follow_results;
            if (list == null) {
                this.follow_results = DEFAULT_FOLLOW_RESULTS;
                return;
            } else {
                this.follow_results = Message.immutableCopyOf(list);
                return;
            }
        }
        this.follow_results = Message.immutableCopyOf(builder.follow_results);
    }
}
