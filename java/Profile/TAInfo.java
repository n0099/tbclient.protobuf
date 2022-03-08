package tbclient.Profile;

import com.baidu.android.imsdk.internal.Constants;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InitContext;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.baidu.titan.sdk.runtime.TitanRuntime;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class TAInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final List<String> DEFAULT_FORUMINFO;
    public static final List<String> DEFAULT_FRIENDINFO;
    public static final Integer DEFAULT_FRIENDNUM;
    public static final List<String> DEFAULT_GROUPINFO;
    public static final Integer DEFAULT_GROUPNUM;
    public static final String DEFAULT_HIDE_USER_FEED = "";
    public static final Integer DEFAULT_IS_FRIEND;
    public static final List<ReplyList> DEFAULT_REPLY_LIST;
    public static final Integer DEFAULT_USERCLIENTVERSIONISLOWER;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 4)
    public final CommonDistance distanceinfo;
    @ProtoField(label = Message.Label.REPEATED, tag = 1, type = Message.Datatype.STRING)
    public final List<String> foruminfo;
    @ProtoField(label = Message.Label.REPEATED, tag = 3, type = Message.Datatype.STRING)
    public final List<String> friendinfo;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer friendnum;
    @ProtoField(label = Message.Label.REPEATED, tag = 2, type = Message.Datatype.STRING)
    public final List<String> groupinfo;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer groupnum;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String hide_user_feed;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer is_friend;
    @ProtoField(tag = 10)
    public final CommonLocation location;
    @ProtoField(label = Message.Label.REPEATED, tag = 8)
    public final List<ReplyList> reply_list;
    @ProtoField(tag = 9, type = Message.Datatype.UINT32)
    public final Integer userClientVersionIsLower;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<TAInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public CommonDistance distanceinfo;
        public List<String> foruminfo;
        public List<String> friendinfo;
        public Integer friendnum;
        public List<String> groupinfo;
        public Integer groupnum;
        public String hide_user_feed;
        public Integer is_friend;
        public CommonLocation location;
        public List<ReplyList> reply_list;
        public Integer userClientVersionIsLower;

        public Builder() {
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                interceptable.invokeUnInit(65536, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65536, newInitContext);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(TAInfo tAInfo) {
            super(tAInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {tAInfo};
                interceptable.invokeUnInit(65537, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    super((Message) newInitContext.callArgs[0]);
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65537, newInitContext);
                    return;
                }
            }
            if (tAInfo == null) {
                return;
            }
            this.foruminfo = Message.copyOf(tAInfo.foruminfo);
            this.groupinfo = Message.copyOf(tAInfo.groupinfo);
            this.friendinfo = Message.copyOf(tAInfo.friendinfo);
            this.distanceinfo = tAInfo.distanceinfo;
            this.groupnum = tAInfo.groupnum;
            this.friendnum = tAInfo.friendnum;
            this.is_friend = tAInfo.is_friend;
            this.reply_list = Message.copyOf(tAInfo.reply_list);
            this.userClientVersionIsLower = tAInfo.userClientVersionIsLower;
            this.location = tAInfo.location;
            this.hide_user_feed = tAInfo.hide_user_feed;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TAInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new TAInfo(this, z, null) : (TAInfo) invokeZ.objValue;
        }
    }

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1695250000, "Ltbclient/Profile/TAInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1695250000, "Ltbclient/Profile/TAInfo;");
                return;
            }
        }
        DEFAULT_FORUMINFO = Collections.emptyList();
        DEFAULT_GROUPINFO = Collections.emptyList();
        DEFAULT_FRIENDINFO = Collections.emptyList();
        DEFAULT_GROUPNUM = 0;
        DEFAULT_FRIENDNUM = 0;
        DEFAULT_IS_FRIEND = 0;
        DEFAULT_REPLY_LIST = Collections.emptyList();
        DEFAULT_USERCLIENTVERSIONISLOWER = 0;
    }

    public /* synthetic */ TAInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TAInfo(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65537, newInitContext);
            int i2 = newInitContext.flag;
            if ((i2 & 1) != 0) {
                int i3 = i2 & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65537, newInitContext);
                return;
            }
        }
        if (z) {
            List<String> list = builder.foruminfo;
            if (list == null) {
                this.foruminfo = DEFAULT_FORUMINFO;
            } else {
                this.foruminfo = Message.immutableCopyOf(list);
            }
            List<String> list2 = builder.groupinfo;
            if (list2 == null) {
                this.groupinfo = DEFAULT_GROUPINFO;
            } else {
                this.groupinfo = Message.immutableCopyOf(list2);
            }
            List<String> list3 = builder.friendinfo;
            if (list3 == null) {
                this.friendinfo = DEFAULT_FRIENDINFO;
            } else {
                this.friendinfo = Message.immutableCopyOf(list3);
            }
            this.distanceinfo = builder.distanceinfo;
            Integer num = builder.groupnum;
            if (num == null) {
                this.groupnum = DEFAULT_GROUPNUM;
            } else {
                this.groupnum = num;
            }
            Integer num2 = builder.friendnum;
            if (num2 == null) {
                this.friendnum = DEFAULT_FRIENDNUM;
            } else {
                this.friendnum = num2;
            }
            Integer num3 = builder.is_friend;
            if (num3 == null) {
                this.is_friend = DEFAULT_IS_FRIEND;
            } else {
                this.is_friend = num3;
            }
            List<ReplyList> list4 = builder.reply_list;
            if (list4 == null) {
                this.reply_list = DEFAULT_REPLY_LIST;
            } else {
                this.reply_list = Message.immutableCopyOf(list4);
            }
            Integer num4 = builder.userClientVersionIsLower;
            if (num4 == null) {
                this.userClientVersionIsLower = DEFAULT_USERCLIENTVERSIONISLOWER;
            } else {
                this.userClientVersionIsLower = num4;
            }
            this.location = builder.location;
            String str = builder.hide_user_feed;
            if (str == null) {
                this.hide_user_feed = "";
                return;
            } else {
                this.hide_user_feed = str;
                return;
            }
        }
        this.foruminfo = Message.immutableCopyOf(builder.foruminfo);
        this.groupinfo = Message.immutableCopyOf(builder.groupinfo);
        this.friendinfo = Message.immutableCopyOf(builder.friendinfo);
        this.distanceinfo = builder.distanceinfo;
        this.groupnum = builder.groupnum;
        this.friendnum = builder.friendnum;
        this.is_friend = builder.is_friend;
        this.reply_list = Message.immutableCopyOf(builder.reply_list);
        this.userClientVersionIsLower = builder.userClientVersionIsLower;
        this.location = builder.location;
        this.hide_user_feed = builder.hide_user_feed;
    }
}
