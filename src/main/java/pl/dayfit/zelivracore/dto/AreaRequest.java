package pl.dayfit.zelivracore.dto;

public record AreaRequest(
    String id,
    String name,
    Coordinates[] coordinates
) {
  protected record Coordinates(int lat, int lng){}
}
