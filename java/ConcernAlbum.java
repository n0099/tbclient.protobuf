package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes7.dex */
public final class ConcernAlbum extends Message {
    public static final List<ConcernUser> DEFAULT_CONCERN_USER = Collections.emptyList();
    public static final Integer DEFAULT_NUM_USER = 0;
    @ProtoField(tag = 3)
    public final Album album;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ConcernUser> concern_user;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer num_user;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<ConcernAlbum> {
        public Album album;
        public List<ConcernUser> concern_user;
        public Integer num_user;

        public Builder() {
        }

        public Builder(ConcernAlbum concernAlbum) {
            super(concernAlbum);
            if (concernAlbum == null) {
                return;
            }
            this.concern_user = Message.copyOf(concernAlbum.concern_user);
            this.num_user = concernAlbum.num_user;
            this.album = concernAlbum.album;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ConcernAlbum build(boolean z) {
            return new ConcernAlbum(this, z);
        }
    }

    public ConcernAlbum(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<ConcernUser> list = builder.concern_user;
            if (list == null) {
                this.concern_user = DEFAULT_CONCERN_USER;
            } else {
                this.concern_user = Message.immutableCopyOf(list);
            }
            Integer num = builder.num_user;
            if (num == null) {
                this.num_user = DEFAULT_NUM_USER;
            } else {
                this.num_user = num;
            }
            this.album = builder.album;
            return;
        }
        this.concern_user = Message.immutableCopyOf(builder.concern_user);
        this.num_user = builder.num_user;
        this.album = builder.album;
    }
}
