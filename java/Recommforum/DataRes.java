package tbclient.Recommforum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes7.dex */
public final class DataRes extends Message {
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<RecommForum> recomm_forum;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<TestInfo> test_info;
    public static final List<TestInfo> DEFAULT_TEST_INFO = Collections.emptyList();
    public static final List<RecommForum> DEFAULT_RECOMM_FORUM = Collections.emptyList();

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<RecommForum> recomm_forum;
        public List<TestInfo> test_info;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.test_info = Message.copyOf(dataRes.test_info);
            this.recomm_forum = Message.copyOf(dataRes.recomm_forum);
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
            List<TestInfo> list = builder.test_info;
            if (list == null) {
                this.test_info = DEFAULT_TEST_INFO;
            } else {
                this.test_info = Message.immutableCopyOf(list);
            }
            List<RecommForum> list2 = builder.recomm_forum;
            if (list2 == null) {
                this.recomm_forum = DEFAULT_RECOMM_FORUM;
                return;
            } else {
                this.recomm_forum = Message.immutableCopyOf(list2);
                return;
            }
        }
        this.test_info = Message.immutableCopyOf(builder.test_info);
        this.recomm_forum = Message.immutableCopyOf(builder.recomm_forum);
    }
}
