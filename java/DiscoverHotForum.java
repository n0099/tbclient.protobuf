package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class DiscoverHotForum extends Message {
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer floor;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<DiscoverTabCard> tab_list;
    public static final List<DiscoverTabCard> DEFAULT_TAB_LIST = Collections.emptyList();
    public static final Integer DEFAULT_FLOOR = 0;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DiscoverHotForum> {
        public Integer floor;
        public List<DiscoverTabCard> tab_list;

        public Builder() {
        }

        public Builder(DiscoverHotForum discoverHotForum) {
            super(discoverHotForum);
            if (discoverHotForum == null) {
                return;
            }
            this.tab_list = Message.copyOf(discoverHotForum.tab_list);
            this.floor = discoverHotForum.floor;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DiscoverHotForum build(boolean z) {
            return new DiscoverHotForum(this, z);
        }
    }

    public DiscoverHotForum(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<DiscoverTabCard> list = builder.tab_list;
            if (list == null) {
                this.tab_list = DEFAULT_TAB_LIST;
            } else {
                this.tab_list = Message.immutableCopyOf(list);
            }
            Integer num = builder.floor;
            if (num == null) {
                this.floor = DEFAULT_FLOOR;
                return;
            } else {
                this.floor = num;
                return;
            }
        }
        this.tab_list = Message.immutableCopyOf(builder.tab_list);
        this.floor = builder.floor;
    }
}
