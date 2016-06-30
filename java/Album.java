package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class Album extends Message {
    public static final String DEFAULT_ALBUM_NAME = "";
    public static final String DEFAULT_LOCATION = "";
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_USER_NAME = "";
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long album_id;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String album_name;
    @ProtoField(label = Message.Label.REPEATED, tag = 12)
    public final List<ConcernUser> concern_user;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer create_time;
    @ProtoField(tag = 10, type = Message.Datatype.UINT32)
    public final Integer distance;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer end_time;
    @ProtoField(label = Message.Label.REPEATED, tag = 11)
    public final List<High> high;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String location;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer num_join;
    @ProtoField(tag = 13, type = Message.Datatype.UINT32)
    public final Integer num_user;
    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer start_time;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long uid;
    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String user_name;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer weight;
    public static final Long DEFAULT_ALBUM_ID = 0L;
    public static final Long DEFAULT_UID = 0L;
    public static final Integer DEFAULT_CREATE_TIME = 0;
    public static final Integer DEFAULT_START_TIME = 0;
    public static final Integer DEFAULT_END_TIME = 0;
    public static final Integer DEFAULT_NUM_JOIN = 0;
    public static final Integer DEFAULT_WEIGHT = 0;
    public static final Integer DEFAULT_DISTANCE = 0;
    public static final List<High> DEFAULT_HIGH = Collections.emptyList();
    public static final List<ConcernUser> DEFAULT_CONCERN_USER = Collections.emptyList();
    public static final Integer DEFAULT_NUM_USER = 0;

    /* synthetic */ Album(Builder builder, boolean z, Album album) {
        this(builder, z);
    }

    private Album(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.album_id == null) {
                this.album_id = DEFAULT_ALBUM_ID;
            } else {
                this.album_id = builder.album_id;
            }
            if (builder.uid == null) {
                this.uid = DEFAULT_UID;
            } else {
                this.uid = builder.uid;
            }
            if (builder.create_time == null) {
                this.create_time = DEFAULT_CREATE_TIME;
            } else {
                this.create_time = builder.create_time;
            }
            if (builder.start_time == null) {
                this.start_time = DEFAULT_START_TIME;
            } else {
                this.start_time = builder.start_time;
            }
            if (builder.end_time == null) {
                this.end_time = DEFAULT_END_TIME;
            } else {
                this.end_time = builder.end_time;
            }
            if (builder.num_join == null) {
                this.num_join = DEFAULT_NUM_JOIN;
            } else {
                this.num_join = builder.num_join;
            }
            if (builder.weight == null) {
                this.weight = DEFAULT_WEIGHT;
            } else {
                this.weight = builder.weight;
            }
            if (builder.album_name == null) {
                this.album_name = "";
            } else {
                this.album_name = builder.album_name;
            }
            if (builder.location == null) {
                this.location = "";
            } else {
                this.location = builder.location;
            }
            if (builder.distance == null) {
                this.distance = DEFAULT_DISTANCE;
            } else {
                this.distance = builder.distance;
            }
            if (builder.high == null) {
                this.high = DEFAULT_HIGH;
            } else {
                this.high = immutableCopyOf(builder.high);
            }
            if (builder.concern_user == null) {
                this.concern_user = DEFAULT_CONCERN_USER;
            } else {
                this.concern_user = immutableCopyOf(builder.concern_user);
            }
            if (builder.num_user == null) {
                this.num_user = DEFAULT_NUM_USER;
            } else {
                this.num_user = builder.num_user;
            }
            if (builder.user_name == null) {
                this.user_name = "";
            } else {
                this.user_name = builder.user_name;
            }
            if (builder.portrait == null) {
                this.portrait = "";
                return;
            } else {
                this.portrait = builder.portrait;
                return;
            }
        }
        this.album_id = builder.album_id;
        this.uid = builder.uid;
        this.create_time = builder.create_time;
        this.start_time = builder.start_time;
        this.end_time = builder.end_time;
        this.num_join = builder.num_join;
        this.weight = builder.weight;
        this.album_name = builder.album_name;
        this.location = builder.location;
        this.distance = builder.distance;
        this.high = immutableCopyOf(builder.high);
        this.concern_user = immutableCopyOf(builder.concern_user);
        this.num_user = builder.num_user;
        this.user_name = builder.user_name;
        this.portrait = builder.portrait;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<Album> {
        public Long album_id;
        public String album_name;
        public List<ConcernUser> concern_user;
        public Integer create_time;
        public Integer distance;
        public Integer end_time;
        public List<High> high;
        public String location;
        public Integer num_join;
        public Integer num_user;
        public String portrait;
        public Integer start_time;
        public Long uid;
        public String user_name;
        public Integer weight;

        public Builder() {
        }

        public Builder(Album album) {
            super(album);
            if (album != null) {
                this.album_id = album.album_id;
                this.uid = album.uid;
                this.create_time = album.create_time;
                this.start_time = album.start_time;
                this.end_time = album.end_time;
                this.num_join = album.num_join;
                this.weight = album.weight;
                this.album_name = album.album_name;
                this.location = album.location;
                this.distance = album.distance;
                this.high = Album.copyOf(album.high);
                this.concern_user = Album.copyOf(album.concern_user);
                this.num_user = album.num_user;
                this.user_name = album.user_name;
                this.portrait = album.portrait;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Album build(boolean z) {
            return new Album(this, z, null);
        }
    }
}
