package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class FavoriteForum extends Message {
    public static final String DEFAULT_FID = "";
    public static final String DEFAULT_FNAME = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String fid;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String fname;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<FavoriteForum> {
        public String fid;
        public String fname;

        public Builder() {
        }

        public Builder(FavoriteForum favoriteForum) {
            super(favoriteForum);
            if (favoriteForum == null) {
                return;
            }
            this.fname = favoriteForum.fname;
            this.fid = favoriteForum.fid;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FavoriteForum build(boolean z) {
            return new FavoriteForum(this, z);
        }
    }

    public FavoriteForum(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.fname;
            if (str == null) {
                this.fname = "";
            } else {
                this.fname = str;
            }
            String str2 = builder.fid;
            if (str2 == null) {
                this.fid = "";
                return;
            } else {
                this.fid = str2;
                return;
            }
        }
        this.fname = builder.fname;
        this.fid = builder.fid;
    }
}
