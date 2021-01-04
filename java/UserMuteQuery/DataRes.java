package tbclient.UserMuteQuery;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.Page;
/* loaded from: classes8.dex */
public final class DataRes extends Message {
    public static final List<MuteUser> DEFAULT_MUTE_USER = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<MuteUser> mute_user;
    @ProtoField(tag = 2)
    public final Page page;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.mute_user == null) {
                this.mute_user = DEFAULT_MUTE_USER;
            } else {
                this.mute_user = immutableCopyOf(builder.mute_user);
            }
            this.page = builder.page;
            return;
        }
        this.mute_user = immutableCopyOf(builder.mute_user);
        this.page = builder.page;
    }

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<MuteUser> mute_user;
        public Page page;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.mute_user = DataRes.copyOf(dataRes.mute_user);
                this.page = dataRes.page;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
