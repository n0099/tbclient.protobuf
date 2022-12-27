package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class HotTWThreadInfo extends Message {
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer fans_count;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<User> user_list;
    public static final List<User> DEFAULT_USER_LIST = Collections.emptyList();
    public static final Integer DEFAULT_FANS_COUNT = 0;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<HotTWThreadInfo> {
        public Integer fans_count;
        public List<User> user_list;

        public Builder() {
        }

        public Builder(HotTWThreadInfo hotTWThreadInfo) {
            super(hotTWThreadInfo);
            if (hotTWThreadInfo == null) {
                return;
            }
            this.user_list = Message.copyOf(hotTWThreadInfo.user_list);
            this.fans_count = hotTWThreadInfo.fans_count;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HotTWThreadInfo build(boolean z) {
            return new HotTWThreadInfo(this, z);
        }
    }

    public HotTWThreadInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<User> list = builder.user_list;
            if (list == null) {
                this.user_list = DEFAULT_USER_LIST;
            } else {
                this.user_list = Message.immutableCopyOf(list);
            }
            Integer num = builder.fans_count;
            if (num == null) {
                this.fans_count = DEFAULT_FANS_COUNT;
                return;
            } else {
                this.fans_count = num;
                return;
            }
        }
        this.user_list = Message.immutableCopyOf(builder.user_list);
        this.fans_count = builder.fans_count;
    }
}
