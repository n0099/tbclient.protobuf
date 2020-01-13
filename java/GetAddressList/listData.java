package tbclient.GetAddressList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes7.dex */
public final class listData extends Message {
    public static final List<friendList> DEFAULT_FRIEND_LIST = Collections.emptyList();
    public static final String DEFAULT_KEY = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<friendList> friend_list;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String key;

    private listData(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.key == null) {
                this.key = "";
            } else {
                this.key = builder.key;
            }
            if (builder.friend_list == null) {
                this.friend_list = DEFAULT_FRIEND_LIST;
                return;
            } else {
                this.friend_list = immutableCopyOf(builder.friend_list);
                return;
            }
        }
        this.key = builder.key;
        this.friend_list = immutableCopyOf(builder.friend_list);
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<listData> {
        public List<friendList> friend_list;
        public String key;

        public Builder() {
        }

        public Builder(listData listdata) {
            super(listdata);
            if (listdata != null) {
                this.key = listdata.key;
                this.friend_list = listData.copyOf(listdata.friend_list);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public listData build(boolean z) {
            return new listData(this, z);
        }
    }
}
