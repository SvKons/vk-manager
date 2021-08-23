package domain;

public class Post {
    private int id;
    private int ownerId;
    private boolean canComplain;
    private boolean canDelete;
    private boolean canEdit;
    private boolean canComment;
    private boolean canViewComments;
    private boolean canLike;
    private boolean isFavourite;
    private int date;
    private String text;

    private CommentsInfo commentsInfo;
    private ViewsInfo viewsInfo;
    private RepostsInfo repostsInfo;
    private LikesInfo likesInfo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public boolean isCanComplain() {
        return canComplain;
    }

    public void setCanComplain(boolean canComplain) {
        this.canComplain = canComplain;
    }

    public boolean isCanDelete() {
        return canDelete;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public boolean isCanComment() {
        return canComment;
    }

    public void setCanComment(boolean canComment) {
        this.canComment = canComment;
    }

    public boolean isCanViewComments() {
        return canViewComments;
    }

    public void setCanViewComments(boolean canViewComments) {
        this.canViewComments = canViewComments;
    }

    public boolean isCanLike() {
        return canLike;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }

    public boolean isFavourite() {
        return isFavourite;
    }

    public void setFavourite(boolean favourite) {
        this.isFavourite = favourite;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String gettext() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
